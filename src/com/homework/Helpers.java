package com.homework;

public class Helpers {
    public static class DistanceHelper {
        public int calculateDistance(double x1, double y1, double x2, double y2) {
            return (int) Math.sqrt(square(x1, x2) + square(y1, y2));
        }
    }

    public static class MathHelper {
        public int sum(int a, int b) {
            return a + b;
        }
    }

    static int square(double x1, double x2) {
        return (int) ((x2 - x1) * (x2 - x1));
    }
}
