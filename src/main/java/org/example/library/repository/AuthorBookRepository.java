package org.example.library.repository;

import org.example.library.key.AuthorBookPrimaryKey;
import org.example.library.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, AuthorBookPrimaryKey> {
}
