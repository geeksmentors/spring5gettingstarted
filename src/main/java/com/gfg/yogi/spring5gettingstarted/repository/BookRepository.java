package com.gfg.yogi.spring5gettingstarted.repository;


import com.gfg.yogi.spring5gettingstarted.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
