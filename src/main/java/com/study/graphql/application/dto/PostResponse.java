package com.study.graphql.application.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class PostResponse {

    private String title;

    private String content;

    private LocalDate date;

    private String writer;

}
