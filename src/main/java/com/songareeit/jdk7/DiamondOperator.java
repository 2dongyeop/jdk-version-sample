package com.songareeit.jdk7;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK 1.7에서 추가된 Diamond Operator
 */
public class DiamondOperator {

    public static void main(String[] args) {

        // JDK 1.7 이전
        List<String> list1 = new ArrayList<String>();

        // JDK 1.7 이후, 다이아몬드 연산자를 사용하여 타입을 중복 기술할 필요가 없음
        List<String> list2 = new ArrayList<>();

        list2.add("Item 1");
        list2.add("Item 2");

        for (String item : list2) {
            System.out.println(item);
        }
    }
}