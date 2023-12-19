package com.practice.spring.springpractice;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import retrofit2.Invocation;

import java.io.IOException;
import java.lang.reflect.Method;

@Service
public class OutboundHttpInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Invocation invocation = request.tag(Invocation.class);
        if (invocation != null) {
            System.out.println("Invocation Found");
            Method method = invocation.method();
            System.out.println("Method Found");
            Metric metric = method.getAnnotation(Metric.class);
            if (metric != null) {
                System.out.println("Metric Found");
                System.out.println(metric.l1().getDummy());
                System.out.println(metric.l2().getDummy());
            }
        }
        return chain.proceed(request);
    }
}
