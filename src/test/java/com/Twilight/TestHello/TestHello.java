package com.Twilight.TestHello;


import com.Twilight.Hello.Hello;
import org.junit.Test;

public class TestHello {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("duf");
        System.out.println(maven);
    }
}
