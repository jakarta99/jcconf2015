package tw.com.softleader.jcconf2015.springdata;

import java.util.List;
import tw.com.softleader.jcconf2015.lombok.BookEntity;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long>{

	public BookEntity findByIsbnCode(String isbnCode);
	
	public List<BookEntity> findByNameLike(String name);
	
}
