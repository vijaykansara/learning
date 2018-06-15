package com.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter your string: ");
            String str = scan.nextLine();
            if(str.isEmpty()){
                System.out.println("You didn't print anything ! Pls try again.");
            }

        scan.close();
        reverseString(str);
    }

    public static void reverseString(String str){

        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String revStr = sb.toString();

        System.out.println(revStr);
    }
}
