import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    private final static String url = "jdbc:mysql://localhost:3306/student_manager";
    private final static String user = "root";

    public static void main(String[] args){

//        if (args[0].equals("updateDB")){
//            updateBD(args[1]);
//        }else {
//            System.out.println("Unavailable command");
//
//        }
        ArrayList<String> studentList = CSVReader.reader("2");
        updateBD(studentList);
    }
    public static void updateBD(ArrayList<String> studentList){
        try {

            Connection connection = DriverManager.getConnection(url, user, "12124576");
            Statement statement = connection.createStatement();

            for (String student: studentList){
                String[] line = student.split(",");


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }





    }




