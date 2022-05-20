package com.classwork.Lesson8;

import java.util.Objects;

public class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return a * 31 + b * 30;
    }
}
