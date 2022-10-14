package com.mkyong.junit4.mock;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
	@Override
	public List<Book> findBookByAuthor(String name) {
		// init database

		// Connect to DB for data
		// dummuy
		List<Book> list = new ArrayList<>();

		// return data
		return list;
	}
}
