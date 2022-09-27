package org.example;/*
 * 추상 클래스
 */

abstract class Animal { abstract void cry();}
class Cat extends Animal{void cry() {System.out.println("냐옹");}}
class Dog extends Animal{void cry() {System.out.println("멍멍");}}

public class Polymorphism02 {
    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
// 추상 메소드는 overriding 해야만 사용할 수 있다(인스턴스를 생성할 수 있다).
// 추상 메소드를 가진 클래스를 상속받는 자식 클래스가, 해당 메소드를 반드시 구현하게 강제할 수 있다.

