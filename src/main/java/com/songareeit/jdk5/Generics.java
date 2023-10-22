package com.songareeit.jdk5;

/**
 * JDK 1.5에 추가된 제네릭 예제 코드
 */
public class Generics {

    public static void main(String[] args) {

        /* 제네릭 클래스이므로 어느 타입이든 삽입 가능 */
        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");

        int intValue = intBox.getValue();
        String strValue = strBox.getValue();

        System.out.println("Integer Value: " + intValue);
        System.out.println("String Value: " + strValue);

        /* 제네릭 메서드이므로 어느 타입이든 배열을 출력 가능 */
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"One", "Two", "Three", "Four", "Five"};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);
    }

    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
