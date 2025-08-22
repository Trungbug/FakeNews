package com.example.demo.controller;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.NewArticle.NewsArticleResponse;
import com.example.demo.service.NewsArticleService;
import com.example.demo.util.Constant;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
@RequiredArgsConstructor
public class NewsArticleController {
    private final NewsArticleService service;

    @PostMapping(value = "/create")
    public ApiResponse<Object> create(@Valid @ModelAttribute NewsArticleRequest request) {
        NewsArticleResponse response = service.createNews(request);
        return ApiResponse.builder()
                .code(HttpStatus.CREATED.value())
                .message(Constant.SUCCESS_MESSAGE)
                .data(response)
                .build();
    }
}
