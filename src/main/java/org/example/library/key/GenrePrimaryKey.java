package org.example.library.key;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

public class GenrePrimaryKey implements Serializable {

    private Long id;

    private String name;

    protected GenrePrimaryKey() {}

    public GenrePrimaryKey(Long id, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenrePrimaryKey that = (GenrePrimaryKey) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "GenrePrimaryKey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
