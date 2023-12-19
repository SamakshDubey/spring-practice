package com.practice.spring.springpractice.functional_prog;

public class HttpExecutor {
    public static <T> T process(HttpFunction<T> function, Class<T> T) {
        return function.call();
    }
}
