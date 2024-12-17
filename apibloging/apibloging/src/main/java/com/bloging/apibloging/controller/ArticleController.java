package com.bloging.apibloging.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bloging.apibloging.Service.ArticleService;
import com.bloging.apibloging.model.Articel;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping()
    public List<Articel> getAllArticles() {
        return service.getAllArticles();
    }
   @GetMapping("/api/articles")
   public List<Articel> getArticels(@PathVariable Long id){
    return service.getAllArticles();
   }
    
    @GetMapping("/{id}")
    public ResponseEntity<Articel> getArticleById(@PathVariable Long id) {
        return service.getArticleById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Articel createArticle(@RequestBody Articel article) {
        return service.createArticle(article);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Articel> updateArticle(@PathVariable Long id, @RequestBody Articel articleDetails) {
        return ResponseEntity.ok(service.updateArticle(id, articleDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Long id) {
        service.deleteArticle(id);
        return ResponseEntity.noContent().build();
    }
}