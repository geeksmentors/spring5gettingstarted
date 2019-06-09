package com.gfg.yogi.spring5gettingstarted.repository;


import com.gfg.yogi.spring5gettingstarted.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
