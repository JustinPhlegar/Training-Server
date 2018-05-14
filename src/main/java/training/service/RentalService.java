package training.service;

import training.generated.CreateRentalRequest;
import training.generated.Rental;
import training.generated.UpdateRentalRequest;

import java.sql.SQLException;
import java.util.List;

public interface RentalService {
	List<Rental> getRentalsByCustomerId(long id) throws SQLException;
	Rental getRentalById(long id) throws SQLException;
	List<Rental> getRentalsByReturnDate(String date) throws SQLException;
	List<Rental> getRentalByStaffId(long id) throws SQLException;
	List<Rental> getRentalByStartDate(String date) throws SQLException;
	void insertRental(CreateRentalRequest request);
	void deleteRental(long rentalId);
	void updateRental(UpdateRentalRequest request);
    List<Rental> getAllRentals();
}