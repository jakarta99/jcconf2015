package tw.com.softleader.jcconf2015.tiger;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", insertable = true, updatable = false)
	private Long id;
	
	@Column(name="ISBN_CODE")
	private String isbnCode;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PUBLISH_DATE")
	private LocalDate publishDate;

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", isbnCode=" + isbnCode + ", name=" + name + ", publishDate=" + publishDate + "]";
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

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
}
