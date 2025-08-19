package com.example.demo.dto.response.NewArticle;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class NewsArticleResponse {
    private Long articleId;
    private String title;
    private String content;
    private String url;
    private String source;
    private LocalDateTime publishedDate;
    private LocalDateTime createdAt;
}
