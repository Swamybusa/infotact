package com.a.author.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.author.model.Author;
import com.a.author.repo.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public Author addAuthor(Author author) {
		return authorRepository.save(author);

	}

	public List<Author> allAuthors() {
		return authorRepository.findAll();
	}
	
	

}
