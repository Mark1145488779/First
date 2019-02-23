package mark._2017302580024;

import javax.xml.soap.Text;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	// write y
        System.out.print(5);
        System.out.println(3);
        System.out.print("2");

        try {
            MySqlConn mysql = new MySqlConn();
            mysql.createTables();
            if (!MySqlConn.ifCreated) {
                mysql.addSome();
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        try {
            Frame1 frame1 = new Frame1();

        }
        catch(Exception e){
            System.out.println(e.toString());
        }

    }




}
