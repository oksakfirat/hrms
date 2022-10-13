package firat.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import firat.hrms.entities.Position;

public interface IPositionDao extends JpaRepository<Position,Integer> {

}
