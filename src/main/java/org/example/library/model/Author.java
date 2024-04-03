package org.example.library.model;

import jakarta.persistence.*;
import org.example.library.key.AuthorPrimaryKey;

@Entity
@Table(name = "authors")
public class Author {

    @EmbeddedId
    private AuthorPrimaryKey primaryKey;

    public Author() {
    }

    public Author(AuthorPrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    public AuthorPrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(AuthorPrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Override
    public String toString() {
        return "Author{" +
                "primaryKey=" + primaryKey +
                '}';
    }
}
