package mx.edu.iems.inventario.services;

import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Area;

import org.springframework.beans.factory.annotation.Autowired;

public class AreaService {
	@Autowired
	AreaDao areaDao;
	
	/**
	 * Metodo para la inyeccion mediante spring
	 * @param areaDao
	 */
	public void setAreaDao(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

	public void insertar(Area area) {
		areaDao.save(area);
	}
	
	public List<Area> listar() {
		return areaDao.list();
	}
}
