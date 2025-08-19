package com.example.demo.service.Imp;

import com.example.demo.dto.request.NewsArticleRequest;
import com.example.demo.dto.response.NewArticle.NewsArticleResponse;
import com.example.demo.entity.NewsArticle;
import com.example.demo.mapper.NewsArticleMapper;
import com.example.demo.repository.NewsArticleRepository;
import com.example.demo.service.NewsArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsArticleServiceImpl implements NewsArticleService {

    private final NewsArticleRepository newsRepository;
    private final NewsArticleMapper newsArticleMapper;
    @Override
    @Transactional
    public NewsArticleResponse createNews(NewsArticleRequest request) {
        NewsArticle news = newsArticleMapper.createRequestToEntity(request);
        return newsArticleMapper.toResponse(newsRepository.save(news));
    }

    @Override
    public Page<NewsArticleResponse> getAllNewsPagination(String keyword, Long countryId, int page, int size, String sortBy, String sortDir) {
        return null;
    }

    @Override
    public List<NewsArticleResponse> getAllNews() {
        return newsRepository.findAll().stream()
                .map(newsArticleMapper::toResponse)
                .toList();
    }

    @Override
    public NewsArticleResponse getNewsById(Long id) {
        NewsArticle news = newsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("News not found with id: " + id));
        return newsArticleMapper.toResponse(news);
    }

    @Override
    public NewsArticleResponse updateNews(Long id, NewsArticleRequest request) {
        return null;
    }

    @Override
    public void deleteNews(Long id) {

    }
}
