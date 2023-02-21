package com.example.code.dao;

import com.example.code.entity.Search;

import java.util.List;

public interface SearchMessageMapper {
    List<Search> selectByScore(int score);
}
