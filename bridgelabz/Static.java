package com.bridgelabz;

public class Static {
    static int x = 10;
    static int y;
    static int z=8;
    public static void main(String args[]) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    static {
        System.out.println("Running static initialization block.");
        y = x + 5;
    }
}
