package com.udemy.callback;

import java.time.LocalDate;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

/**
 *
 * @author Jan
 */
public class ArticleListener {

    @PrePersist
    public void beforePersist(Article article) {
        article.setDate(LocalDate.now());
        System.out.println("Before persisting article...");
    }

    @PostPersist
    public void afterPersist(Article article) {
        System.out.println(article);
        System.out.println("After persisting article...");
    }

}
