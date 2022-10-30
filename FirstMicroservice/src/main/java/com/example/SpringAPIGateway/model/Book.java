package com.example.SpringAPIGateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

}