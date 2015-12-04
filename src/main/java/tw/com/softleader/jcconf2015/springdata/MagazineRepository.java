package tw.com.softleader.jcconf2015.springdata;

import java.util.List;
import tw.com.softleader.jcconf2015.lombok.MagazineEntity;

import org.springframework.data.repository.CrudRepository;

public interface MagazineRepository extends CrudRepository<MagazineEntity, Long>{

	public MagazineEntity findByIsbnCode(String isbnCode);
	
	public List<MagazineEntity> findByNameLike(String name);
	
}
