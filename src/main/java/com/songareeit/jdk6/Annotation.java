package com.songareeit.jdk6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * JDK 1.6에서 추가된 사용자 정의 애너테이션
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {

    String value() default "Default Value";

    int count() default 0;
}

public class Annotation {
    @MyAnnotation(value = "Custom Value", count = 10)
    public void myAnnotatedMethod() {
        System.out.println("Annotation.myAnnotatedMethod");
    }

    public static void main(String[] args) throws NoSuchMethodException {

        // Annotation (예제) 클래스 추출
        Class<Annotation> clazz = Annotation.class;

        // (애너테이션을 작성해놓은) 메서드 추출
        Method method = clazz.getMethod("myAnnotatedMethod");

        // 추출한 메서드로부터 애너테이션 추출
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        // 애너테이션 내용 검증
        if (annotation != null) {
            String value = annotation.value();
            int count = annotation.count();
            System.out.println("Value: " + value);
            System.out.println("Count: " + count);
        }
    }
}