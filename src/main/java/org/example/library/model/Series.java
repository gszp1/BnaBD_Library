package org.example.library.model;

import jakarta.persistence.*;
import org.example.library.key.SeriesPrimaryKey;

@Entity
@Table(name = "series")
@IdClass(SeriesPrimaryKey.class)
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series_id")
    private Long id;

    @Column(length = 255)
    private String name;

    protected Series() {}

    public Series(Long id, String name) {
        this.id = id;
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
        return "Series{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
