package com.userRegistrationTest;
import com.java.InvalidUserDetailException;
import com.java.UserRegistrationUsingJunit;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegTestLogic {
  UserRegistrationUsingJunit user=new UserRegistrationUsingJunit();
    @Test
   public void validFirstName() throws InvalidUserDetailException {
        //assertEquals("Sunny", UserRegistrationUsingJunit.isValidFirstName("sunny"));
        //assertEquals("Jonny", UserRegistrationUsingJunit.isValidFirstName("Jonny"));}
        boolean result=user.isValidFirstName("Kajal");
        try{
            result=user.isValidFirstName("Kajal89");
        }catch (InvalidUserDetailException e){
            System.out.println("Invalid");
        }
    }
    @Test
      public void validLastName() throws InvalidUserDetailException {
        //assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("Disuza"));
        //assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("disuza"));//Invalid string
        boolean result=user.isValidLastName("Disuza");
        try{
            result=user.isValidLastName("Disuza23");
        }catch (InvalidUserDetailException e){
            System.out.println("Invalid ");
        }
    }
    @Test
    public void validEmailId() throws InvalidUserDetailException {
       //assertEquals("abc@yahoo.com", UserRegistrationUsingJunit.isValidEmailId("abc@yahoo.com"));
        //assertEquals("abc100@abc.com", UserRegistrationUsingJunit.isValidEmailId("abc100@abc.com"));//Invalid email
        boolean result=user.isValidEmailId("abc@1.com");
        try{
            result=user.isValidEmailId("abc1com");
        }catch (InvalidUserDetailException e){
            System.out.println("Invalid");
        }
    }

    @Test
    public void prdefinedNumber() throws InvalidUserDetailException {

     //  assertEquals("91 9809807657", UserRegistrationUsingJunit.predefinedMobileFormat("91 9809807657"));
        // assertEquals("919809807657", UserRegistrationUsingJunit.predefinedMobileFormat("919809807657"));
       boolean result=user.predefinedMobileFormat("91 876908765");
        try{
          result=user.predefinedMobileFormat("61876908765");
        }catch (InvalidUserDetailException e){
            System.out.println("Invalid");
        }
    }
    @Test
    public void passwordEightCharacter() throws InvalidUserDetailException {
       // assertEquals("Khjiytrdsl@12", UserRegistrationUsingJunit.passwordHaveEightCharacter("Khjiytrdsl@12"));
       // assertEquals("khjiytrdsl@12", UserRegistrationUsingJunit.passwordHaveEightCharacter("khjiytrdsl@12"));
        boolean result=user.passwordHaveEightCharacter("Ahyjtdjhi@123");
        try{
            result=user.passwordHaveEightCharacter("Ajhgytg");
        }catch (InvalidUserDetailException e){
            System.out.println("Invalid");
        }
    }

   /* @Test
    public void claerValidEmail() throws InvalidDetailException {
       // assertEquals("kajal@gmail.com", UserRegistrationUsingJunit.clearValidSampleEmail("kajal@gmail.com"));
        boolean result=user.clearValidSampleEmail("Ahyjtd@123");
        try{
            result=user.clearValidSampleEmail("Ajhgytg");
        }catch (InvalidDetailException e){
            System.out.println("Invalid");
        }

    }*/
    }

