package com.bloging.apibloging.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "ApiBlog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articel {
    
   
    public Articel(String title,Long id, String content, String tags, LocalDate publishesDate) {
        this.id = id;
        this.content = content;
        this.tags = tags;
        this.publishesDate = publishesDate;
        this.title=title;
    }
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String content;
    private String tags;
    private String title;
    
    @Column(name="publishes_date")
    private LocalDate publishesDate;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDate getPublishesDate() {
        return publishesDate;
    }
    public void setPublishesDate(LocalDate publishesDate) {
        this.publishesDate = publishesDate;
    }




}
