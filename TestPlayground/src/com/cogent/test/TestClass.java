package com.cogent.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass {
    
    @BeforeEach
    void init() {
        
        System.out.println("TEST CASE STARTED");
        
    }

    @Test
    void testSum() {

        // arrange
        int exp = 5;
        // act
        int act = MainClass.sumInt(2, 3);
        // assert
        assertEquals(exp, act);;

    }
    
    @Test 
    void testConcatString(){
        
        // arrange 
        String a = "Hello ";
        String b = "World!";
        // act
        String exp = "Hello World!";
        String act = MainClass.concatStrings(a, b);
        // assert
        assertEquals(exp, act);
        
    }
    
    @AfterEach
    void done() {
        
        System.out.println("TEST CASE FINISHED");
        
    }
}
