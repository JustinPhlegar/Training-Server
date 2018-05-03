package soap.database.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "sakila.city")
@Table(name = "city")
public class CityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long city_id;
	@NotNull
	private String city;
	@NotNull
	private long country_id;
	@NotNull
	private String last_update;

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
}
