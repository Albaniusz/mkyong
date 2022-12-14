package com.mkyong.junit4.mock;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthorServiceTest {
	@Test
	public void test_total_book_by_mockito() {
		//1. Setup
		List<Book> books = Arrays.asList(
				new Book("mkyong in action"),
				new Book("abc in action"),
				new Book("bot"));

		BookServiceImpl mockito = mock(BookServiceImpl.class);

		//if the author is "mkyong", then return a 'books' object.
		when(mockito.findBookByAuthor("mkyong")).thenReturn(books);

		AuthorServiceImpl obj = new AuthorServiceImpl();
		obj.setBookService(mockito);
		obj.setBookValidatorService(new FakeBookValidatorService());

		//2. Test method
		int qty = obj.getTotalBooks("mkyong");

		//3. Verify result
		assertThat(qty, is(2));
	}
}