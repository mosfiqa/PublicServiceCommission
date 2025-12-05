package fatin;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/exam_system";
            String user = "root";
            String pass = "";

            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
