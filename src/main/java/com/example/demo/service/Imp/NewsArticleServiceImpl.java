package com.example.demo.service.Imp;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.NewsArticleResponse;
import com.example.demo.entity.NewsArticle;
import com.example.demo.repository.NewsArticleRepository;
import com.example.demo.service.NewsArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsArticleServiceImpl implements NewsArticleService {

    private final NewsArticleRepository newsRepository;

    @Override
    public NewsArticleResponse createNews(NewsArticleRequest request) {
        NewsArticle news = NewsArticle.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .url(request.getUrl())
                .source(request.getSource())
                .publishedDate(request.getPublishedDate())
                .build();
        return null;
    }

    @Override
    public List<NewsArticleResponse> getAllNews() {
        return List.of();
    }

    @Override
    public NewsArticleResponse getNewsById(Long id) {
        return null;
    }

    @Override
    public NewsArticleResponse updateNews(Long id, NewsArticleRequest request) {
        return null;
    }

    @Override
    public void deleteNews(Long id) {

    }
}
