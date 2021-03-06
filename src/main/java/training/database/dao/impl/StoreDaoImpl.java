package training.database.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import training.database.entity.StoreEntity;
import training.generated.Store;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StoreDaoImpl {
	protected EntityManager em;
	private AddressDaoImpl addressDaoImpl;
	private StaffDaoImpl staffDaoImpl;
	private static final String baseQuery = "SELECT s FROM sakila.store s";

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Autowired @Lazy
	public void setAddressDaoImpl(AddressDaoImpl addressDaoImpl) {
		this.addressDaoImpl = addressDaoImpl;
	}

	@Autowired @Lazy
	public void setStaffDaoImpl(StaffDaoImpl staffDaoImpl) {
		this.staffDaoImpl = staffDaoImpl;
	}

	public Store getById(long id){
		try{
			return convertEntityToGenerated(this.em.createQuery(baseQuery+" WHERE s.store_id = '"+id+"'", StoreEntity.class).getSingleResult());
		} catch (javax.persistence.NoResultException e){
			//e.printStackTrace();
			return new Store();
		}
	}

	private Store convertEntityToGenerated(StoreEntity entity){
		Store store = new Store();

		//System.out.println("store id = ["+entity.getStore_id()+"]");
		store.setStoreId(entity.getStore_id());

		//System.out.println("address id = ["+entity.getAddress_id()+"]");
		store.setAddress(addressDaoImpl.getById(entity.getAddress_id()));

		//System.out.println("staff id = ["+entity.getStore_id()+"]");
		store.setManager(staffDaoImpl.getById(entity.getManager_staff_id()));

		return store;
	}
}
