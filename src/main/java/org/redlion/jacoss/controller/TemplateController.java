package org.redlion.jacoss.controller;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.PathParam;

/**
 * Created by alejandro on 2/6/16.
 */
@Controller
@RequestScoped
public class TemplateController {
    @RequestMapping("template/{path}")
    public String getTemplate(@PathParam("path") String path) {
        return path;
    }
}
