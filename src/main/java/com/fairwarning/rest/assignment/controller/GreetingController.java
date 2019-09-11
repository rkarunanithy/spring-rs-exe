package com.fairwarning.rest.assignment.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="first", defaultValue="") String first,
                           @RequestParam(value="last", defaultValue="") String last) {
        String result = "Welcome";
        result = result+" "+first + " " +last;
        result = result.trim();

        return result;
    }
}
