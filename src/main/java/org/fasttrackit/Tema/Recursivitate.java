package org.fasttrackit.Tema;




public class Recursivitate {
    public static void main(String[] args) {
        System.out.println(sumofFirst(4));
        System.out.println(sumofEven(4));
        System.out.println("The reversed string is: "+reverse);



    }

    public static int sumofFirst(int n) {
        if (n == 1) {
            return 1;

        }
        return n + sumofFirst(n - 1);
    }

    public static int sumofEven(int n) {
        int sum = 0;
        int evennumber = 2;
        for (int count = 1; count <= 100; count++) {
            sum += evennumber;
            evennumber += 2;
        }
        return sum;
    }
    static String  str="Palindrome";
    static String reverse= reverseString(str);

    private static String reverseString(String str) {
        if (str.isEmpty())
            return str;

        //Calling Function Recursively

        return reverseString(str.substring(1)) + str.charAt(0);

    }



}
