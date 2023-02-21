package com.example.code.controller;

import com.example.code.entity.Search;
import com.example.code.service.MessageService;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MessageController {
    private MessageService messageService;

    @RequestMapping(path = "/searchmessage")
    public List<Search> findMessage(){
        return messageService.findMessageByScore(10);
    }

}
