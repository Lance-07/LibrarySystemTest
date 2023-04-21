package com.example.librarysystemtest;

public class BookListModel {
    private String bookName, bookAuthor, bookCategory;
    private int bookImages;

    public BookListModel(String bookName, String bookAuthor, String bookCategory, int bookImages) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookImages = bookImages;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public int getBookImages() {
        return bookImages;
    }
}
