package tw.com.softleader.jcconf2015.entity;

import java.sql.Timestamp;

public class Book {

	private Long id;
	
	private String isbnCode;
	
	private String name;
	
	private Timestamp publishDate;

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbnCode=" + isbnCode + ", name=" + name + ", publishDate=" + publishDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
}
