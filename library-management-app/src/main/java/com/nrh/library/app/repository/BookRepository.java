package com.nrh.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrh.library.app.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
