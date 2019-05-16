package com.udemy.callback;

import java.time.LocalDate;
import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@EntityListeners(ArticleListener.class)
public class Article {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int articleId;
    
    @Column(name="article_name")
    private String articleName;
    
    private LocalDate date;

    public Article() {
    }

    public Article(String articleName) {
        this.articleName = articleName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%5d %20s %20s", articleId, articleName, date);
    }
}