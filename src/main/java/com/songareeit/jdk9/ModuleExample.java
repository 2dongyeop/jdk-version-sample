package com.songareeit.jdk9;

import com.songareeit1.package1.Class1;

/**
 * JDK 9에 추가된 
 */
public class ModuleExample {

    public static void main(String[] args) {

        // build.gradle에 :path 잡아주기
        Class1 class1 = new Class1();
        class1.print();
    }
}
