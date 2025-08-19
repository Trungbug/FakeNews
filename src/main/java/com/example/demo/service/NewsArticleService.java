package com.example.demo.service;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.NewArticle.NewsArticleResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface NewsArticleService {
    NewsArticleResponse createNews(NewsArticleRequest request);

    Page<NewsArticleResponse> getAllNewsPagination(String keyword, Long countryId, int page, int size, String sortBy, String sortDir);

    List<NewsArticleResponse> getAllNews();

    NewsArticleResponse getNewsById(Long id);

    NewsArticleResponse updateNews(Long id, NewsArticleRequest request);

    void deleteNews(Long id);
}
