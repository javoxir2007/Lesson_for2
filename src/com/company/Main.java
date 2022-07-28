package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("n ");
        int n = scanner.nextInt();
        for (int i = n; i > 1; i--) {
            if (i%2==0){
                System.out.println(i+"");
            }

        }
    }
}
























