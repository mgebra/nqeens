package com.example.nqueens;

public class App {

    public static void main(String[] args) {
        if (args == null && args.length != 1) {
            System.out.println("Please pass only one Integer argument");
        } else {

            Integer n = null;
            try {
                n = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("Please enter valid positive number");
            }

            if (n != null) {
                System.out.println(new NQueens().placeQueens(n));
            }
        }
    }
}
