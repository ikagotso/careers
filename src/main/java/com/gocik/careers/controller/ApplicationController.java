package com.gocik.careers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Goc1k
 */
@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String main() {
        return "main";
    }
}
