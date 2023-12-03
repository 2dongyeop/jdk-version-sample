package com.songareeit.jdk15;

/**
 * JDK 15에 추가된 Sealed Class 예제
 */
public class SealedClassExample {

    public static void main(String[] args) {
        final Person employee = new Employee();
        final Person manager = new Manager();
        final Person director = new Director();

        employee.work();
        manager.work();
        director.work();
    }
}

sealed interface Person permits Employee, Manager, Director {
    void work();
}

// sealed : 자식도 마찬가지로 상속받을 서브 클래스를 명시할 수 있다.
sealed class Employee implements Person permits Employee2 {
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}

// non-sealed : 모든 서브 클래스들에 의해 확장될 수 있다.
non-sealed class Manager implements Person {
    @Override
    public void work() {
        System.out.println("제품을 관리합니다.");
    }
}

// final : 더 이상 확장할 수 없다.
final class Director implements Person {
    @Override
    public void work() {
        System.out.println("제품을 기획합니다.");
    }
}

final class Employee2 extends Employee {
}