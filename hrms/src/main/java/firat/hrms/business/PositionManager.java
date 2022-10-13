package firat.hrms.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import firat.hrms.dataAccess.IPositionDao;
import firat.hrms.entities.Position;
@Service
public class PositionManager implements PositionService {
	private IPositionDao positionDao;

	@Autowired
	public PositionManager(IPositionDao positionDao) {
		this.positionDao=positionDao;
	}

	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
		
	}

	

}
