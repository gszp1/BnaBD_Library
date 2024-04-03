package org.example.library.model;

import jakarta.persistence.*;
import org.example.library.key.PublisherPrimaryKey;

@Entity
@Table(name = "publishers")
@IdClass(PublisherPrimaryKey.class)
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long id;

    @Column(length = 255)
    private String name;

    protected Publisher() {}

    public Publisher(String name) {
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
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
