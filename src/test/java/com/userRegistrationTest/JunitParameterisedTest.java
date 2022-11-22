package com.userRegistrationTest;
import com.java.InvalidUserDetailException;
import com.java.UserRegistrationUsingJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
public class JunitParameterisedTest {
    private final boolean result;
    private final String emailAddress;
    UserRegistrationUsingJunit user;

    public JunitParameterisedTest(boolean result, String emailAddress) {
        this.result = result;
        this.emailAddress = emailAddress;

    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@yahoo.com",false},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false},
        });
    }

    @Test
    public void validateEmailTest() throws InvalidUserDetailException {
        user=new UserRegistrationUsingJunit();
        boolean result= user.clearValidSampleEmail.check(emailAddress);
        Assert.assertEquals(emailAddress,result);
    }
}


