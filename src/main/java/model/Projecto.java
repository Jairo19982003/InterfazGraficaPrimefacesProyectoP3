package model;

import java.io.Serializable;

public class Projecto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String language;
    private String date;
    private String author;
    private String description;
    private String code;
    private String repositoryLink;

    // Constructor
    public Projecto(String name, String language, String date, String author, String description, String code, String repositoryLink) {
        this.name = name;
        this.language = language;
        this.date = date;
        this.author = author;
        this.description = description;
        this.code = code;
        this.repositoryLink = repositoryLink;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRepositoryLink() {
        return repositoryLink;
    }

    public void setRepositoryLink(String repositoryLink) {
        this.repositoryLink = repositoryLink;
    }
}
