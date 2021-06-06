/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex01.base;

import java.util.Scanner;

/* I worked on this alongside the Prof in the lecture so it
will probably look pretty similar.*/

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String []args) {
        App myApp = new App();

        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    public String readName() {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        return name;
    }

    public String generateOutputString(String name) {
        return String.format("Hello, " + name + ", nice to meet you!");
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}
