package org.redlion.jacoss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Path;

/**
 * Created by alejandro on 30/5/16.
 */
@Controller
public class Base {

    @RequestMapping("/base")
    public String hello() {
        return "layouts/dashboard";
    }

}
