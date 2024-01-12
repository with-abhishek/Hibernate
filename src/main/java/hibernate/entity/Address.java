package hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Address2")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int pin_code;
	
	@ManyToOne
	
	private Employee employee;

	public Address() {}

	public Address(String city, String state, int pin_code) {
		super();
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
	}

	
	
}
