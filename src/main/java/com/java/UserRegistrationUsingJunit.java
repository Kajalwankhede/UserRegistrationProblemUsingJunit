package com.java;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationUsingJunit {
    static ArrayList<String> list = new ArrayList<String>();

    public static boolean isValidFirstName(String firstName) {
        System.out.println("Checking Valid First Name:");
        list.add("Sunny");
        list.add("Jonny");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add("Valid name" + firstName);
        } else {
            list.add("invalid name");
        }
        return result;
    }

    public static boolean isValidLastName(String lastName) {
        System.out.println("Checking Valid Last Name:");
        list.add("Dicruz");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(lastName);
        } else {
            list.add("invalid name");
        }
        return result;

    }
}