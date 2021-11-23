import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;


public class Main {

    private final static String url = "jdbc:mysql://localhost:3306/student_manager";
    private final static String user = "root";
    private final static String groupid = "";
    private final static String id = "";
    private final static String groupName = "";

    public static void main(String[] args){

//        if (args[0].equals("updateDB")){
//            updateBD(args[1]);
//        }else {
//            System.out.println("Unavailable command");
//
//        }

        String path = "C:/someFolder/studentDir/" + "17704.csv";
        ArrayList<String> studentList = CSVReader.reader(path);

        Statement st = createConn();
        DataWrite.updateBD(studentList, groupid, id, groupName, st);
    }

    public static Statement createConn(){

        try {
            Connection connection = DriverManager.getConnection(url, user, "12124576");
            Statement statement = connection.createStatement();
            return statement;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}




