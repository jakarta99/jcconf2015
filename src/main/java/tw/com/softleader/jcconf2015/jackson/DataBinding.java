package tw.com.softleader.jcconf2015.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.softleader.jcconf2015.entity.Book;

public class DataBinding {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setId(1L);
		book1.setName("Java 技術手冊");
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			// write
			mapper.writeValue(new File("book.json"), book1);
			
			// read
			Book book2 = mapper.readValue(new File("book.json"), Book.class);
			System.out.println(book2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
