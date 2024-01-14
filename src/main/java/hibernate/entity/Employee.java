package hibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Employee2")
@Data

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;

	private int salary;

	@ManyToMany(cascade = CascadeType.ALL)
	List<Address> Addresses;

	public Employee() {
	}

	public Employee(String name, String gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

}
