package training.database.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "sakila.address")
@Table(name = "address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long address_id;
	@NotNull
	private String address;
	@NotNull
	private String address2;
	@NotNull
	private String district;
	@NotNull
	private long city_id;
	@NotNull
	private String postal_code;
	@NotNull
	private String phone;

	public AddressEntity() {
	}

	public AddressEntity(long address_id, @NotNull String address, @NotNull String address2, @NotNull String district, @NotNull long city_id, @NotNull String postal_code, @NotNull String phone) {
		this.address_id = address_id;
		this.address = address;
		this.address2 = address2;
		this.district = district;
		this.city_id = city_id;
		this.postal_code = postal_code;
		this.phone = phone;
	}

	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
