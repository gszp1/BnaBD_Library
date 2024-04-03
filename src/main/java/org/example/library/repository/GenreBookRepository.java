package org.example.library.repository;

import org.example.library.key.GenreBookPrimaryKey;
import org.example.library.model.GenreBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreBookRepository extends JpaRepository<GenreBook, GenreBookPrimaryKey> {
}
