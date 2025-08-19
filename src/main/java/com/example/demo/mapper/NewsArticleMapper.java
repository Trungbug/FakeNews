package com.example.demo.mapper;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.NewArticle.NewsArticleResponse;
import com.example.demo.entity.NewsArticle;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsArticleMapper {
    private final ModelMapper modelMapper;

    public NewsArticle createRequestToEntity(NewsArticleRequest request) {
        if (request == null) {
            return null;
        }
        return modelMapper.map(request, NewsArticle.class);
    }
    public void updateRequestToEntity(NewsArticle newsArticle, NewsArticleRequest request) {
        modelMapper.map(request, newsArticle);
    }
    public NewsArticleResponse toResponse(NewsArticle newsArticle) {
        if (newsArticle == null) {
            return null;
        }
        return modelMapper.map(newsArticle, NewsArticleResponse.class);

    }
}
