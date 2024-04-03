package org.example.library.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name = "books_users")
public class BookUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_user_id")
    private Long Id;

    @Column(name = "borrow_date", nullable = false)
    private LocalDate borrowDate;

    @Column(nullable = false)
    private Byte borrowed;

    @Column(nullable = false)
    private BigDecimal fee;

    @Column(nullable = false, name = "return_date")
    private LocalDate returnDate;

    protected BookUser() {}

    public BookUser(LocalDate borrowDate, Byte borrowed, BigDecimal fee, LocalDate returnDate) {
        this.borrowDate = borrowDate;
        this.borrowed = borrowed;
        this.fee = fee;
        this.returnDate = returnDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Byte getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Byte borrowed) {
        this.borrowed = borrowed;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "Id=" + Id +
                ", borrowDate=" + borrowDate +
                ", borrowed=" + borrowed +
                ", fee=" + fee +
                ", returnDate=" + returnDate +
                '}';
    }
}
