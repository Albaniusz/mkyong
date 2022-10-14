package com.mkyong.junit4.mock;

import java.util.List;

public interface BookService {
	List<Book> findBookByAuthor(String author);
}
