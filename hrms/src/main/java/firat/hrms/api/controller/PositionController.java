package firat.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import firat.hrms.business.PositionService;
import firat.hrms.entities.Position;
@RestController
@RequestMapping("/api/position")
public class PositionController {
	private PositionService positionService;
	@Autowired
	public PositionController(PositionService positionService) {
		this.positionService=positionService;
	}
	@GetMapping("/getAll")
	public List<Position> getAll(){
		return this.positionService.getAll();
	}

}
