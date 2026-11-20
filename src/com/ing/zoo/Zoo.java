package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Crane karen = new Crane();
        karen.name = "karen";
        Carp john = new Carp();
        john.name = "john";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if (input.contains("henk")) {
            String[] splitString = input.split(" henk");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    henk.sayHello();
                    break;
                case "give meat":
                    henk.eatMeat();
                    break;
                default:
                    System.out.print("Henk cannot do this.");
            }
        } else if (input.contains("elsa")) {
            String[] splitString = input.split(" elsa");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    elsa.sayHello();
                    break;
                case "give leaves":
                    elsa.eatLeaves();
                    break;
                default:
                    System.out.print("Elsa cannot do this.");  
            }
        } else if (input.contains("dora")) {
            String[] splitString = input.split(" dora");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    dora.sayHello();
                    break;
                case "give leaves":
                    dora.eatLeaves();
                    break;
                case "give meat":
                    dora.eatMeat();
                    break;
                case "perform trick":
                    dora.performTrick();
                    break;
                default:
                    System.out.print("Dora cannot do this.");  
            }
        } else if (input.contains("wally")) {
            String[] splitString = input.split(" wally");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    wally.sayHello();
                    break;
                case "give meat":
                    wally.eatMeat();
                    break;
                case "perform trick":
                    wally.performTrick();
                    break;
                default:
                    System.out.print("Wally cannot do this.");   
            }
        } else if (input.contains("marty")) {
            String[] splitString = input.split(" marty");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    marty.sayHello();
                    break;
                case "give leaves":
                    marty.eatLeaves();
                    break;
                default:
                    System.out.print("Marty cannot do this.");   
            }
        } else if (input.contains("karen")) {
            String[] splitString = input.split(" karen");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    karen.sayHello();
                    break;
                case "give leaves":
                    karen.eatLeaves();
                    break;
                case "give meat":
                    karen.eatMeat();
                    break;
                case "perform trick":
                    karen.performTrick();
                    break;
                default:
                    System.out.print("Karen cannot do this."); 
            }
        } else if (input.contains("john")) {
            String[] splitString = input.split(" john");
            String command = splitString[0];
            switch (command) {
                case "hello":
                    john.sayHello();
                    break;
                case "give leaves":
                    john.eatLeaves();
                    break;
                case "perform trick":
                    john.performTrick();
                    break;
                default:
                    System.out.print("John cannot do this."); 
            }
        }
        else {
            switch (input) {
                case "hello":
                    henk.sayHello();
                    elsa.sayHello();
                    dora.sayHello();
                    wally.sayHello();
                    marty.sayHello();
                    karen.sayHello();
                    john.sayHello();
                    break;
                case "give leaves":
                    elsa.eatLeaves();
                    dora.eatLeaves();
                    marty.eatLeaves();
                    karen.eatLeaves();
                    john.eatLeaves();
                    break;
                case "give meat":
                    henk.eatMeat();
                    dora.eatMeat();
                    wally.eatMeat();
                    karen.eatMeat();
                    break;
                case "perform trick":
                    dora.performTrick();
                    wally.performTrick();
                    karen.performTrick();
                    john.performTrick();
                    break;
                default:
                    System.out.println("Unknown command and/or name: " + input);
            }
        }

        scanner.close();
    }
}
