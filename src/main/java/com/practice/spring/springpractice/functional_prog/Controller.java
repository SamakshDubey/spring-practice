package com.practice.spring.springpractice.functional_prog;

public class Controller {

    public static void main(String[] args) {
        final Service service = new Service();
        System.out.println(HttpExecutor.process(() -> service.getNotification(1), String.class));
    }
}
