package in.practice.ajinkya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmpTab")
public class Employee {
	@Id
	@Column(name="Eid")
	private Integer eid;
	@Column(name="Ename")
	private String ename;
	@Column(name="Epin")
	private Integer epin;
	@Column(name="Eloc")
	private String eloc;
	@Column(name="Esal")
	private Double esal;
	
}
