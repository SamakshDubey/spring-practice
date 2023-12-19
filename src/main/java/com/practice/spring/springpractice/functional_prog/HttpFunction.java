package com.practice.spring.springpractice.functional_prog;

@FunctionalInterface
public interface HttpFunction<R> {
    public R call();
}
