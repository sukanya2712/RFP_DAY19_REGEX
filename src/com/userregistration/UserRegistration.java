package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
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
    }
}
