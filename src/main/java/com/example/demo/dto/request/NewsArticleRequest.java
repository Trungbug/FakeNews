package com.example.demo.dto.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class NewsArticleRequest {
    private String title;
    private String content;
    private String url;
    private String source;
    private LocalDateTime publishedDate;
}
