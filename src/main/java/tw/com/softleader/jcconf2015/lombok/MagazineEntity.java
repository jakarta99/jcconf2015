package tw.com.softleader.jcconf2015.lombok;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="MAGAZINE")
@ToString
@Getter
@Setter
public class MagazineEntity {

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
	
	
}
