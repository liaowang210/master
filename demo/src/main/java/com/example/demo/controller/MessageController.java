package com.example.demo.controller;

import com.example.demo.entity.Search;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private  MessageService messageService;

    @RequestMapping(path = "/searchmessage/{score}",method = RequestMethod.GET)
    public List<Search> findMessage(@PathVariable(name = "score") int score){
        return messageService.findMessageByScore(score);
    }

}
