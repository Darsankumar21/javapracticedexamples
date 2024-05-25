
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EmployeeOperation {
    Connection con;
    PreparedStatement pst;
    String url ="jdbc:mysql://127.0.0.1:3306/srmdb";
    String unm ="root";
    String pwd = "123456";
    public EmployeeOperation(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, unm, pwd);
        }
        catch(ClassNotFoundException c){
            c.printStackTrace();
        }
        catch(SQLException s){
            s.printStackTrace();
        }
    }
    public void storeData(Employee e)
    {
        Date dt = new Date(e.getDoj().getTime());
        int result=0;
        String sql ="insert into emptable(id,name,address,desig,"+"salary) values(?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, e.getId());
            pst.setString(2,e.getName());
            pst.setString(3, e.getAddress());
            pst.setString(4, e.getDesig());
            pst.setFloat(5,e.getSalary());
            pst.execute();
            System.out.println(result+"no of rows inserted");
        } catch(SQLException s){
            s.printStackTrace();
        }
        public void retrieveData(){}
        public void retrieveData(int id){}
        public void updateData(int id, String desig, String address){}
        public void deleteData(int id){}
    }
}
