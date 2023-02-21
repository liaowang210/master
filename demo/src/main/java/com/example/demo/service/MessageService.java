package com.example.demo.service;

import com.example.demo.dao.SearchMessageMapper;
import com.example.demo.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private SearchMessageMapper searchMessageMapper;

    public List<Search> findMessageByScore(int score){
        return searchMessageMapper.selectByScore(score);
    }

}
