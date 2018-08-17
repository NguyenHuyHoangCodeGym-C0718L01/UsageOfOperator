package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert width: ");
        width = scanner.nextFloat();

        System.out.println();
        System.out.print("Insert height: ");
        height = scanner.nextFloat();

        System.out.println();
        System.out.println("Area of Rectangle: "+(width*height));
    }
}
