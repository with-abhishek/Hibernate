package hibernate.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Employee {

	
	private  int id;
	private String name;
	private String gender;

	private int salary;

	
	

	

}
