package com.java;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationUsingJunit {
    static ArrayList<String> list = new ArrayList<String>();
    //public static boolean isValidFirstName(String firstName) throws InvalidUserDetailException {
    // public static boolean isValidFirstName(String name) throws InvalidUserDetailException {
    public UserDetailsInterface isValidFirstName = (firstName) -> {

        System.out.println("Checking Valid First Name:");
        list.add("Sunny");
        list.add("Jonny");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(firstName);
            return true;
        }
        throw new InvalidUserDetailException();

    };
    //public static boolean isValidLastName(String lastName) throws InvalidUserDetailException{
    public UserDetailsInterface isValidLastName = (lastName) -> {
        System.out.println("Checking Valid Last Name:");
        list.add("Dicruz");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(lastName);
            return true;
        }
        throw new InvalidUserDetailException();

    };
    // public static boolean isValidEmailId(String EmailId) throws  InvalidUserDetailException {
    public UserDetailsInterface isValidEmailId = (EmailId) -> {
        list.add("Kajal@gmail.com");
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(EmailId);
        boolean result = (matcher.matches());
        if (result == true) {
            return true;
        }

        throw new InvalidUserDetailException();

    };
    //public static boolean predefinedMobileFormat(String phoneNumber) throws InvalidUserDetailException{
    public UserDetailsInterface predefinedMobileFormat = (phoneNumber) -> {
        System.out.println("Checking predefined mobile format:");
        list.add("91 9876098765");
        String regex = "[91]+() +[789][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = (matcher.matches());
        if (result == true) {
            return true;
        }
        throw new InvalidUserDetailException();

    };
    //public static boolean passwordHaveEightCharacter(String password) throws InvalidUserDetailException {
    public UserDetailsInterface passwordHaveEightCharacter = (password) -> {
        System.out.println("Checking password have 8 characters:");
        list.add("Kajalfhh@12");
        String regex = "[A-Z]{1}[a-z0-9](?=.*[-+_!@#$%^&*.,?]).{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = (matcher.matches());
        if (result == true) {
            return true;
        }
        throw new InvalidUserDetailException();
    };
    //public static boolean clearValidSampleEmail(String email) throws InvalidUserDetailException {
    public UserDetailsInterface clearValidSampleEmail = (email) -> {
        System.out.println("Checking password have 8 characters:");
        list.add("user@domain.co.in");
        list.add("user1@domain.com");
        list.add("user.name@domain.com");
        list.add("user#domain.com");//Invalid emails
        list.add("@yahoo.com");
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = (matcher.matches());
        if (result == true) {
            list.add(email);
        }
        for (int i = list.size() - 1; i > 1; i--) {
            list.remove(i);
            System.out.println("List after removing Email Id: " + list);
        }
        throw new InvalidUserDetailException();
    };

}