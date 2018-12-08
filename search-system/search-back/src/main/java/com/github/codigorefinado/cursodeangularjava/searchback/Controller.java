package com.github.codigorefinado.cursodeangularjava.searchback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    public String index() {
        return "<a href=\"http://t.me/codigorefinado\"> telegram </a>";
    }

}
