package org.example.library.repository;

import org.example.library.key.KeywordBookPrimaryKey;
import org.example.library.model.KeywordBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordBookRepository extends JpaRepository<KeywordBook, KeywordBookPrimaryKey> {
}
