package com.userRegistrationTest;
import com.java.UserRegistrationUsingJunit;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegTestLogic {
    @Test
   public void validFirstName(){
  //assertEquals("Sunny", UserRegistrationUsingJunit.isValidFirstName("sunny"));
     assertEquals("Jonny", UserRegistrationUsingJunit.isValidFirstName("Jonny"));}
    @Test
            public void validLastName(){
        assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("Disuza"));
        assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("disuza"));//Invalid string
    }
    @Test
    public void validEmailId(){
       assertEquals("abc@yahoo.com", UserRegistrationUsingJunit.isValidEmailId("abc@yahoo.com"));
        assertEquals("abc100@abc.com", UserRegistrationUsingJunit.isValidEmailId("abc100@abc.com"));//Invalid email
    }

    @Test
    public void prdefinedNumber(){

       assertEquals("91 9809807657", UserRegistrationUsingJunit.predefinedMobileFormat("91 9809807657"));
        // assertEquals("919809807657", UserRegistrationUsingJunit.predefinedMobileFormat("919809807657"));
    }
    }

