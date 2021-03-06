package training.database.entity;

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

	public CityEntity() {
	}

	public CityEntity(long city_id, @NotNull String city, @NotNull long country_id) {
		this.city_id = city_id;
		this.city = city;
		this.country_id = country_id;
	}

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
}
