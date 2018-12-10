package com.github.codigorefinado.cursodeangularjava.searchback.controller;

import com.github.codigorefinado.cursodeangularjava.searchback.model.Topic;
import com.github.codigorefinado.cursodeangularjava.searchback.repository.TopicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    TopicRepository topicRepository;

//    @RequestMapping
//    public String index() {
//        return "<a href=\"http://t.me/codigorefinado\"> telegram </a>";
//    }

    @RequestMapping("/")
    public List<Topic> index(){
        return topicRepository.findByDescriptionLikeIgnoreCase("%spring%");
    }


}
