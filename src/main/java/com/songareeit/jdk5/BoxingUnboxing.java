package com.songareeit.jdk5;

/**
 * JDK 1.5에 추가된 박싱/언박싱 예제 코드
 */
public class BoxingUnboxing {

    public static void main(String[] args) {

        /* Primitive Type */
        int number = 1;
        int otherNumber = 1;

        System.out.println(number == otherNumber); // true


        /* Wrapper Class (Reference Type */
        Integer integerNumber = Integer.valueOf(1);
        Integer otherIntegerNumber = Integer.valueOf(1);

        System.out.println(integerNumber == otherIntegerNumber); // false
        System.out.println(integerNumber.equals(otherIntegerNumber)); // true


        /* Auto Boxing, Unboxing */
        // 아래 코드는 다음과 같음. Integer integerNum = Interger.valueOf(300);
        Integer boxingNum = 300;
        System.out.println("boxingNum = " + boxingNum);

        // 아래 코드는 다음과 같음. int intNum = integerNum.intValue();
        int unboxingNum = boxingNum;
        System.out.println("unboxingNum = " + unboxingNum);
    }
}
