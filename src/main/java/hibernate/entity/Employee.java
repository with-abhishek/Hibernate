package hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Data;

@Entity (name="employee")
@Data

@NamedQuery(
		name = "Employee.findEmployeeById", 
		query = "from employee E WHERE E.id > :id"
		)
@NamedQuery(
	    name = "Employee.findByGender",
	    query = "SELECT e FROM employee e WHERE e.gender = :gender"
	)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String name;
	private String gender;

	private int salary;
	

	

	

}
