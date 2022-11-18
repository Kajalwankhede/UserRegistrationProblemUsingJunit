package com.userRegistrationTest;
import com.java.UserRegistrationUsingJunit;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegTestLogic {
    @Test
   public void validFirstName(){
 Assert.assertEquals("Sunny", UserRegistrationUsingJunit.isValidFirstName("sunny"));
     assertEquals("Jonny", UserRegistrationUsingJunit.isValidFirstName("Jonny"));}
    @Test
            public void validLastName(){
        assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("Disuza"));
        assertEquals("Disuza", UserRegistrationUsingJunit.isValidLastName("disuza"));//Invalid string
    }
}
