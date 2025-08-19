package com.example.demo.service;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.NewsArticleResponse;

import java.util.List;

public interface NewsArticleService {
    NewsArticleResponse createNews(NewsArticleRequest request);

    List<NewsArticleResponse> getAllNews();

    NewsArticleResponse getNewsById(Long id);

    NewsArticleResponse updateNews(Long id, NewsArticleRequest request);

    void deleteNews(Long id);
}
