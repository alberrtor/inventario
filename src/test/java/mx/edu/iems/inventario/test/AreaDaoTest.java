/*package mx.edu.iems.inventario.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Area;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AreaDaoTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private AreaDao areaDao;

	public void setareaDAO(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

//public class AreaDaoTest {
	//private AreaDao areaDao = new AreaDao();
	
	@Test
	public void testListar(){
		List<Area> areas = new ArrayList<Area>();
		
		areas = areaDao.list();
		
		//Checa que no se nulo
		assertNotNull(areas);
		//checa que no esté vacía
		assertTrue(!areas.isEmpty());
	}
}
*/