package com.practice.spring.springpractice;

import com.practice.spring.springpractice.retrofit.GoogleHttpClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@RestController
public class HomeController {

    private final OutboundHttpInterceptor interceptor;

    @Autowired
    public HomeController(OutboundHttpInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @GetMapping("")
    public Object hello() throws IOException {
        OkHttpClient okHttp = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttp)
                .baseUrl("https://dummyjson.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        GoogleHttpClient client = retrofit.create(GoogleHttpClient.class);
        Call<Object> call = client.home();
        return call.execute().body();
    }
}
