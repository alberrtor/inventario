package mx.edu.iems.inventario.actions.area;

import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.services.AreaService;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ListarAreasAction extends ActionSupport {
	private static final Logger log = LoggerFactory.getLogger(ListarAreasAction.class);
	private List<Area> areas;

	//Get how many rows we want to have into the grid - rowNum attribute in the
	// grid
	private Integer rows = 0;

	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;

	// sorting order - asc or desc
	private String sord;

	// get index row - i.e. user click to sort.
	private String sidx;

	// Search Field
	private String searchField;

	// The Search String
	private String searchString;

	// he Search Operation
	// ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
	private String searchOper;

	// Your Total Pages
	private Integer total = 0;

	// All Record
	private Integer records = 0;

	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private AreaService areaService;

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getSearchOper() {
		return searchOper;
	}

	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public AreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	/**
	 * Método que se ejecuta por default cuando se llama el action
	 * listarUsuarios
	 */
	public String execute() {
		
		int to = (rows * page);
	    int from = to - rows;

	    DetachedCriteria criteria = DetachedCriteria.forClass(Area.class);
	    
	    //Count Rows (select count(*) from custumer)
	    records = areaService.countByCriteria(criteria);
	    
	    // Reset count Projection
	    criteria.setProjection(null);
	    criteria.setResultTransformer(Criteria.ROOT_ENTITY);
	    
	    log.debug("Records " + records);		

	   //Your logic to search and select the required data.
	    //areas = areaService.findByCriteria(criteria, from, rows);
		
	    areas = areaService.listar();
	    		
		if(to > records) to = records;
		
		//calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		
		return SUCCESS;
	}
}
