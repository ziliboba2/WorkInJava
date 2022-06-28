package com.homework.hoework12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Gun gun;
        Attacker attacker = new Attacker();
        System.out.println("Выберите телохранителя: 1- каратист, 2-боксер, 3-джиуджист. ");
        String text = scanner.nextLine();
        switch (text){
            case ("1"):
            {
Karateka karateka = new Karateka();
                attacker.Attack();
                karateka.saveClientLife(attacker);

                break;
            }
            case ("2"):
            {
Boxer boxer = new Boxer();
attacker.Attack();
boxer.saveClientLife(attacker);
                break;
            }
            case ("3"):{
                Juugist juugist = new Juugist();
                attacker.Attack();
                juugist.saveClientLife(attacker);

                break;
            }

        }
    }
}
