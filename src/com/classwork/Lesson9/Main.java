package com.classwork.Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input day of week");
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);

        List<Student> students = new ArrayList<>();
             students.add(new Student("Nazar", DayOfWeek.MONDAY));
        students.add(new Student("Liana", DayOfWeek.TUESDAY));
        students.add(new Student("Nikita", DayOfWeek.WEDNESDAY));
        students.add(new Student("Sofia", DayOfWeek.THURSDAY));
        students.add(new Student("Andriy", DayOfWeek.FRIDAY));
        students.add(new Student("Vova", DayOfWeek.SATURDAY));
        students.add(new Student("Mariana", DayOfWeek.SUNDAY));

    }
}
