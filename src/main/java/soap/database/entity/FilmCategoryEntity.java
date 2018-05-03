package soap.database.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "sakila.film_category")
@Table(name = "film_category")
public class FilmCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private long film_id;
	@NotNull
	private long category_id;
	@NotNull
	private String last_update;

	public long getFilm_id() {
		return film_id;
	}

	public void setFilm_id(long film_id) {
		this.film_id = film_id;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
}
