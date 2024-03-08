package com.SpringBoot.First_Application.Book;

public class Book_Info {
    private Integer id;
    private String bookname;
    private String authorName;
    private String publisherName;
    private Integer edition;
    private Integer noOfpage;
    private String language;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return bookname;
    }

    public void setName(String name) {
        this.bookname = name;
    }

    public Integer getNoOfpage() {
        return noOfpage;
    }

    public void setNoOfpage(Integer noOfpage) {
        this.noOfpage = noOfpage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Book_Info(Integer id, String bookname, String authorName, String publisherName, Integer edition, Integer noOfpage, String language) {
        this.id = id;
        this.bookname = bookname;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.edition = edition;
        this.noOfpage = noOfpage;
        this.language = language;
    }
}
