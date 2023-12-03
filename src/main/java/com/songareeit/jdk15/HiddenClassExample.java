package com.songareeit.jdk15;

import java.lang.invoke.*;
import java.lang.reflect.Method;

public class HiddenClassExample {

    public static void main(String[] args) throws Throwable {
        final MethodHandles.Lookup lookup = MethodHandles.lookup();

        // Hidden Class를 생성합니다.
        final Class<?> hiddenClass = lookup.defineClass(
                """
                        public class Hidden {
                            public void sampleMethod() {
                                System.out.println("Hidden Class의 메서드를 호출합니다.");
                            }
                        }
                        """.getBytes());

        // Hidden Class의 인스턴스를 생성하고 메서드 호출
        final var instance = hiddenClass.getDeclaredConstructor().newInstance();
        final Method method = hiddenClass.getMethod("sampleMethod");
        method.invoke(instance);
    }
}