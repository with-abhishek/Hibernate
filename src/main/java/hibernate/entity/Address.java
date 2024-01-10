package hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Address1")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int pin_code;
//	@OneToMany
	private Employee Employee;
	
	public Address() {
		
	}
	
	public Address(String city, String state, int pin_code) {
		super();
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", pin_code=" + pin_code + "]";
	}
	
	
}
