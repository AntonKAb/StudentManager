import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataWrite extends Main{
    public static void updateBD(ArrayList<String> studentList, String groupid, String id, String groupName, Statement statement) {

        try {

            for (String student: studentList){
                String[] line = student.split(",");
                statement.executeUpdate("INSERT Student(studentid, groupid, first_name, second_name, last_name, birthday_date) " +
                        "VALUES ('" + id + "','" + groupid + ",'" + line[0] + "', '" + line[1] + "', '"
                        + line[2] + "', '" + line[3] + "')");
                statement.executeUpdate("INSERT S_group(id, group_name) " +
                        "VALUES ('" + id + "', '" + groupName + "')");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
