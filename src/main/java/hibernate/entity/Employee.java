package hibernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity 
//@Table(name="HCL_emp")
//@Data
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String name;
	private String gender;
	private int salary;
	//@OneToOne
	@OneToOne (cascade=CascadeType.ALL) // --> don't require to save or persist for address class object automatically persist through the employee object
	private Address add;
	
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	

}
