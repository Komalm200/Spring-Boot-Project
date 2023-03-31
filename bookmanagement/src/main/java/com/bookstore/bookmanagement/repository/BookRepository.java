package com.bookstore.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookmanagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
