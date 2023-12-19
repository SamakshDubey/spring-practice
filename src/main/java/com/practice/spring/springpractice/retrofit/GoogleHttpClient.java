package com.practice.spring.springpractice.retrofit;

import com.practice.spring.springpractice.LevelOne;
import com.practice.spring.springpractice.LevelTwo;
import com.practice.spring.springpractice.Metric;
import com.practice.spring.springpractice.RetrofitClient;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import retrofit2.Call;
import retrofit2.http.GET;

@RetrofitClient(base = "https://dummyjson.com")
public interface GoogleHttpClient {

    @GET("/products")
    @Metric(l1 = LevelOne.DUMMY_ONE, l2 = LevelTwo.DUMMY_TWO)
    Call<Object> home();
}
