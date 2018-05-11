package soap.database.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import soap.database.Database;
import soap.database.entity.CustomerEntity;
import soap.generated.CreateCustomerRequest;
import soap.generated.Customer;
import soap.generated.UpdateCustomerRequest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CustomerDao extends Database {
	@PersistenceContext @Lazy private EntityManager em;
	@Autowired @Lazy private AddressDao addressDao;
	private static final String baseQuery = "SELECT c FROM sakila.customer c";

	public List<Customer> getActive() {
		return convertEntitystoGenerated(this.em.createQuery(baseQuery+" WHERE c.active = '1'",CustomerEntity.class).getResultList());
	}

	public Customer getById(long id) {
		return convertEntityToGenerated(this.em.createQuery(baseQuery+" WHERE c.customer_id = '"+id+"'", CustomerEntity.class).getSingleResult());
	}

	public List<Customer> getByStore(long id) {
		return convertEntitystoGenerated(this.em.createQuery(baseQuery+" WHERE c.store_id = '"+id+"'",CustomerEntity.class).getResultList());
	}

	public List<Customer> getAll() {
		return convertEntitystoGenerated(this.em.createQuery(baseQuery, CustomerEntity.class).getResultList());
	}

	public void insert(CreateCustomerRequest request) {
		String sql = "INSERT INTO customer (store_id, first_name, last_name, email, address_id, active) VALUES " +
				"('"+request.getStoreId()+"', '"+
				request.getFirstName()+"', '"+
				request.getLastName()+"', '"+
				request.getEmail()+"', '"+
				request.getAddressId()+"', '"+
				request.isActive()+"');";
		try {
			getConnection().createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(long customerId) {
		String sql = "DELETE FROM customer WHERE customer_id='"+customerId+"';";
		try {
			getConnection().createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(UpdateCustomerRequest request) {
		String sql = "UPDATE customer SET ";

		if (request.isActive()!=null)
			sql += "active = '"+request.isActive()+"', ";
		if (request.getAddressId()!=null)
			sql += "address_id = '"+request.getAddressId()+"', ";
		if (request.getEmail()!=null)
			sql += "email = '"+request.getEmail()+"', ";
		if (request.getFirstName()!=null)
			sql += "first_name = '"+request.getFirstName()+"', ";
		if (request.getLastName()!=null)
			sql += "last_name = '"+request.getLastName()+"', ";
		if (request.getStoreId()!=null)
			sql += "store_id = '"+request.getStoreId()+"', ";

		sql = sql.subSequence(0,sql.length()-2) + " WHERE customer_id = '"+request.getCustomerId()+"';";

		try {
			getConnection().createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private List<Customer> convertEntitystoGenerated(List<CustomerEntity> entities){
		List<Customer> customers = new ArrayList<>();

		for (CustomerEntity entity : entities){
			customers.add(convertEntityToGenerated(entity));
		}

		return customers;
	}

	private Customer convertEntityToGenerated(CustomerEntity entity){
		Customer customer = new Customer();

		//System.out.println("customer id = ["+entity.getCustomer_id()+"]");
		customer.setCustomerId(entity.getCustomer_id());

		//System.out.println("store id = ["+entity.getStore_id()+"]");
		customer.setStoreId(entity.getStore_id());

		//System.out.println("first name = ["+entity.getFirst_name()+"]");
		customer.setFirstName(entity.getFirst_name());

		//System.out.println("last name = ["+entity.getLast_name()+"]");
		customer.setLastName(entity.getLast_name());

		//System.out.println("email = ["+entity.getEmail()+"]");
		customer.setEmail(entity.getEmail());

		//System.out.println("address id = ["+entity.getAddress_id()+"]");
		customer.setAddress(addressDao.getById(entity.getAddress_id()));

		//System.out.println("active = ["+entity.isActive()+"]");
		customer.setIsActive(entity.isActive());

		//System.out.println("create date = ["+entity.getCreate_date()+"]");
		customer.setCreateDate(entity.getCreate_date());

		//System.out.println("last update = ["+entity.getLast_update()+"]");
		customer.setLastUpdate(entity.getLast_update());

		return customer;
	}
}
