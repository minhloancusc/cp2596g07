package mypack;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author minhloan
 */
public class EmployeesDAOImp implements EmployeesDAO {

    @Override
    public Employees checkLogin(String username, String password) {
        Employees emp = null;
        Connection conn = MyConnection.getConnection();
        String sql = "select EmployeeID,LastName,FirstName,Username,Password, Email,PhotoPath from Employees where Username=? and Password=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                emp = new Employees(rs.getInt("EmployeeID"), rs.getString("LastName"), rs.getString("FirstName"), rs.getString("Username"), rs.getString("Password"), rs.getString("Email"), rs.getString("PhotoPath"));
                return emp;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return emp;
    }

    @Override
    public List<Employees> showAllEmployees() {
        List<Employees> listEmployee = new ArrayList<>();

        return listEmployee;
    }

}
