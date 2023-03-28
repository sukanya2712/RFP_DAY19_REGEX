package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //uc1
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Sukanya");
        if (matcher.matches())
            System.out.println("valid firstname");
        else
            System.out.println("Invalid firstname");

        //uc2
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern.matcher("Naik");
        if (matcher.matches())
            System.out.println("valid lastname");
        else
            System.out.println("Invalid lastname");

        //uc3
        Pattern pattern2 = Pattern.compile("^( [a-z]{3} [.] [a-z]{3}  @ ([a-z]{2} [.] [a-z]{2}) [.][a-z]{2,}$)");
       // System.out.println("Enter email : ");
        Matcher matcher2 = pattern.matcher("abc.xyz@bl.co.in");
        if (matcher.matches())
            System.out.println("valid email");
        else
            System.out.println("Invalid email");

        //uc4
        Pattern pattern3 = Pattern.compile("^(\\+?\\d{1,3})\s\\d{10}$");
        Matcher matcher3 = pattern.matcher("+91 9822042799");
        if (matcher.matches())
            System.out.println("valid phone no");
        else
            System.out.println("Invalid phone no");

    }
}
