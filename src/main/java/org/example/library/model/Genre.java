package org.example.library.model;

import jakarta.persistence.*;
import org.example.library.key.GenrePrimaryKey;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genres")
@IdClass(GenrePrimaryKey.class)
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long id;

    @Id
    @Column(length = 255)
    private String name;

    protected Genre() {}

    public Genre(String name) {
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
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
