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
    public static boolean isValidEmailId(String EmailId) {
        System.out.println("Checking Vali dEmail Id:");
        list.add("Dicruz");
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(EmailId);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(EmailId);
        } else {
            list.add("invalid name");
        }
        return result;

    }
     public static boolean predefinedMobileFormat(String phoneNumber) {
        System.out.println("Checking predefined mobile format:");
        list.add("91 9876098765");
        String regex = "[91]+() +[789][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(phoneNumber);
        } else {
            list.add(" invalid");
        }

         return result;
     }
    public static boolean passwordHaveEightCharacter(String password) {
        System.out.println("Checking password have 8 characters:");
        list.add("khyuikljh");
        String regex = "[A-Z]{1}[a-z0-9](?=.*[-+_!@#$%^&*.,?]).{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(password);
        } else {
            list.add(" invalid");
        }

        return result;
    }
}