package com.example.code.service;

import com.example.code.dao.SearchMessageMapper;
import com.example.code.entity.Search;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private SearchMessageMapper searchMessageMapper;

    public List<Search> findMessageByScore(int score){
        return searchMessageMapper.selectByScore(score);
    }

}
