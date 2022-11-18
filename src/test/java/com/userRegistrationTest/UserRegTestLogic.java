package com.userRegistrationTest;
import com.java.UserRegistrationUsingJunit;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegTestLogic {
    @Test
    public void validFirstName(){
  // Assert.assertEquals("Sunny", UserRegistrationUsingJunit.isValidFirstName("sunny"));
    assertEquals("Jonny", UserRegistrationUsingJunit.isValidFirstName("Jonny"));
    }
}
