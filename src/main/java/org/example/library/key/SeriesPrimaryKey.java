package org.example.library.key;

import java.io.Serializable;
import java.util.Objects;

public class SeriesPrimaryKey implements Serializable {

    private Long id;

    private String name;

    protected SeriesPrimaryKey() {}

    public SeriesPrimaryKey(Long id, String name) {
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
        SeriesPrimaryKey that = (SeriesPrimaryKey) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SeriesPrimaryKey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
