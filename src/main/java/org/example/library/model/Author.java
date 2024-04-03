package org.example.library.model;

import jakarta.persistence.*;
import org.example.library.key.AuthorPrimaryKey;

@Entity
@Table(name = "authors")
@IdClass(AuthorPrimaryKey.class)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;

    @Id
    @Column(length = 255)
    private String name;

    protected Author() {}

    public Author(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
