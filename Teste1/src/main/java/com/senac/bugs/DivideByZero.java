package com.senac.bugs;

public class DivideByZero {

    public static void main(String[] args) {
        int number = 10;
        int divisor = 0;
        int result = number / divisor;
        System.out.println(result);
    }
}

