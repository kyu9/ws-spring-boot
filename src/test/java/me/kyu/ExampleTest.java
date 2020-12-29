package me.kyu;

import me.kyu.user.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class ExampleTest {

    @Autowired
    UserService userService;

    @Test
    public void di(){
        Assert.assertNotNull(userService);
    }
}
