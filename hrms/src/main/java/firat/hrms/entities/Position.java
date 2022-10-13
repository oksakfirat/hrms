package firat.hrms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="ispozisiyonlari")
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="pozisyonad")
	private String pozisyonad;
	
	public Position() {
		
	}

	public Position(int id, String pozisyonad) {
		super();
		this.id = id;
		this.pozisyonad = pozisyonad;
	}

	

}
