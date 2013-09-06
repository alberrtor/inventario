package mx.edu.iems.inventario.test;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Area;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class GenericDaoTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private AreaDao areaDao;

	public void setareaDAO(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

//public class AreaDaoTest {
	//private AreaDao areaDao = new AreaDao();
	
	@Test
	public void testSave(){
		Area area = new Area();
		area.setDescripcion("zz3xx");
		
		areaDao.save(area);
		
	}
}