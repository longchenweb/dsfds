package com.service.sdfdsf.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSdfdsf {

        SdfdsfDelegate sdfdsfDelegate = new SdfdsfDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sdfdsfDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}