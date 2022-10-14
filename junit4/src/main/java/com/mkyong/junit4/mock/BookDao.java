package com.mkyong.junit4.mock;

import java.util.List;

public interface BookDao {
	List<Book> findBookByAuthor(String author);
}
