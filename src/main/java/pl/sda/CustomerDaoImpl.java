package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private DriverManagerDataSource dataSource;

    @Override
    public List<Customer> findAll() {

        List<Customer> myList = new ArrayList<>();

        String sql = "SELECT * FROM CUSTOMER";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            Customer customer = null;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                myList.add(new Customer(
                        rs.getInt("CUST_ID"),
                        rs.getString("NAME"),
                        rs.getInt("Age"))
                );
            }
            rs.close();
            ps.close();
            return myList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }


}
