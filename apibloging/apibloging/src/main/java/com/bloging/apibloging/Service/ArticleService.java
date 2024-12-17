package com.bloging.apibloging.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloging.apibloging.ArticaleRepository.ArticleRepository;
import com.bloging.apibloging.model.Articel;
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;
    public List<Articel> getAllArticles() {
        return repository.findAll();
    }

    public Optional<Articel> getArticleById(Long id) {
        return repository.findById(id);
    }

    public Articel createArticle(Articel article) {
        return repository.save(article);
    }

    public Articel updateArticle(Long id, Articel articleDetails) {
        Articel article = repository.findById(id).orElseThrow(() -> new RuntimeException("Article not found"));
        article.setTitle(articleDetails.getTitle());
        article.setContent(articleDetails.getContent());
        article.setTags(articleDetails.getTags());
        article.setPublishesDate(articleDetails.getPublishesDate());
        return repository.save(article);
    }

    public void deleteArticle(Long id) {
        repository.deleteById(id);
    }
}
