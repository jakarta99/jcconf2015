package tw.com.softleader.jcconf2015.springdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import tw.com.softleader.jcconf2015.Jcconf2015App;
import tw.com.softleader.jcconf2015.lombok.MagazineEntity;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={Jcconf2015App.class})
public class MagazineRepositoryTest {
	
	@Autowired
	private MagazineRepository magazineRespository;

	@Test
	public void testFindByIsbnCode() {
		MagazineEntity magazine = new MagazineEntity();
		magazine.setIsbnCode("A123-456-777");
		magazine.setName("Happy to Learn SpringBoot");
		magazineRespository.save(magazine);
		
		MagazineEntity dbEntity = magazineRespository.findByIsbnCode("A123-456-777");
		log.debug("{}", dbEntity);
		assertEquals(magazine.getName(), dbEntity.getName());
	}

}
