package com.pskindero.dogtherapy.ui.cfg;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebErrorController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "error.html";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
