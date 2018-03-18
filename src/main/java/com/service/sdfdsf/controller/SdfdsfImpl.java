package com.service.sdfdsf.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-18T02:06:56.431Z")

@RestSchema(schemaId = "sdfdsf")
@RequestMapping(path = "/sdfdsf", produces = MediaType.APPLICATION_JSON)
public class SdfdsfImpl {

    @Autowired
    private SdfdsfDelegate userSdfdsfDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSdfdsfDelegate.helloworld(name);
    }

}
