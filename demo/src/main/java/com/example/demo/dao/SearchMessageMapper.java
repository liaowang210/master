package com.example.demo.dao;

import com.example.demo.entity.Search;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMessageMapper {
    List<Search> selectByScore(int score);
}
