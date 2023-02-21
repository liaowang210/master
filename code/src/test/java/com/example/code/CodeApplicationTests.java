package com.example.code;

import com.example.code.entity.Search;
import com.example.code.service.MessageService;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CodeApplicationTests {

    @Test
    void contextLoads() {
        MessageService messageService = new MessageService();
        List<Search> messageByScore = messageService.findMessageByScore(10);
        System.out.println(messageByScore.toString());
    }

    @Test
    void test(){
        System.out.println(1);
    }

}
