package com.socialsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by veigelto on 7/5/16.
 */
@RequestMapping("/app")
@Controller
class IndexController {

    @RequestMapping({
            "/home"
    })
    public String index() {
        return "index.html";
    }

}