package training.database.dao;

public interface CategoryDao {
    String getNameById(long category_id);
	long getIdByName(String category);
}
