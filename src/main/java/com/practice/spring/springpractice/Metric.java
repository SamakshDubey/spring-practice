package com.practice.spring.springpractice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface Metric {
    public LevelOne l1() default LevelOne.DUMMY_DEFAULT;
    public LevelTwo l2() default LevelTwo.DUMMY_DEFAULT;
}
