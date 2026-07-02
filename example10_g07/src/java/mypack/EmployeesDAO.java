package mypack;

import java.util.List;

/**
 *
 * @author minhloan
 */
public interface EmployeesDAO {
    public Employees checkLogin(String username, String password);
    public List<Employees> showAllEmployees();
}
