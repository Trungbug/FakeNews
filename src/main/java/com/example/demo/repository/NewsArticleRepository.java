package com.example.demo.repository;

import com.example.demo.entity.NewsArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long> {
    // Custom query methods can be defined here if needed
}
