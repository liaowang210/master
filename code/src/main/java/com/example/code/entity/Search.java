package com.example.code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Search implements Serializable {
    private String search_message1;
    private String search_message2;
    private int score;
    private String keyword;


}
