package com.geekbrains.repositories;

import com.geekbrains.entities.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BooksRepository extends PagingAndSortingRepository<Book, Long> {
}
