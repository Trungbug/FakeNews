package com.example.demo.repository;

import com.example.demo.entity.NewsArticle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find articles by title or author, you could add:

    Page<NewsArticle> findNewsArticleByTitleAndAndContent(String keyword,
                                  Long countryId,
                                 Pageable pageable);
}
