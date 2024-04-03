package org.example.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "keywords")
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "keyword_id")
    private Long id;

    @Id
    @Column(length = 255)
    private String name;

    protected Keyword() {}

    public Keyword(String name) {
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
        return "Keyword{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
