package com.a.author.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.author.model.Author;
import com.a.author.service.AuthorService;

@RestController
@RequestMapping("authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping("insertAuthor")
	Author insertAuthor(@RequestBody Author author) {
		return authorService.addAuthor(author);

	}

	@GetMapping("authorsList")
	List<Author> getAuthorsList() {

		return authorService.allAuthors();
	}

}
