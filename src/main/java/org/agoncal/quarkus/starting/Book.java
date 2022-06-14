package org.agoncal.quarkus.starting;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Book extends PanacheEntity {

    public Long id;
    public String title;
    public String author;
    public int yearOfPublication;
    public String genre;

    public String getTitle(){
        return title.toUpperCase();
    }

    public void setTitle(String title){
        this.title = title.toUpperCase();
    }

    public static Book findByTitle(String title){
        return find("title", title).firstResult();
    }

}
