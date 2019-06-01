package pl.sda;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAll();

    public void insert(Customer customer);

    public void delete(int custId);

    List<Customer> findAllJdbcTemplate();
}
