package com.github.kmizu.scala_kotlin_java;

public class JavaClass extends KotlinClass {
    public JavaClass(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println(new JavaClass("Java").getName());
    }
}
