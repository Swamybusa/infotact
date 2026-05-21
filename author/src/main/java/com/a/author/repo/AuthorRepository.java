package com.a.author.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a.author.model.Author;

@Repository
public interface AuthorRepository  extends JpaRepository<Author, Long>{

}
