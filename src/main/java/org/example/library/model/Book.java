package org.example.library.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(length = 255, unique = true, nullable = false)
    private String isbn;

    @Column(length = 255, nullable = false)
    private String image;

    @Column(length = 255, unique = true, nullable = false)
    private String name;

    @Column(length = 255)
    private String place;

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @OneToMany(mappedBy="book")
    private List<BookUser> bookBorrows = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "series_id")
    private Series series;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    private List<KeywordBook> bookKeywords = new ArrayList<>();

    @ManyToMany
    @JoinTable(
        name = "book_genres",
        joinColumns = @JoinColumn(name = "books_book_id"),
        inverseJoinColumns = @JoinColumn(name = "genres_genre_id")
    )
    private List<Genre> genres = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<AuthorBook> bookAuthors = new ArrayList<>();

    protected Book() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<BookUser> getBookBorrows() {
        return bookBorrows;
    }

    public void setBookBorrows(List<BookUser> bookBorrows) {
        this.bookBorrows = bookBorrows;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<KeywordBook> getBookKeywords() {
        return bookKeywords;
    }

    public void setBookKeywords(List<KeywordBook> bookKeywords) {
        this.bookKeywords = bookKeywords;
    }

    public List<AuthorBook> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<AuthorBook> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


}
