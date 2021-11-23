import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader extends Main{

    public static ArrayList<String> reader(String path){

        BufferedReader br = null;
        String line = "";

        try {
            ArrayList<String> students = new ArrayList<>();
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                students.add(line);
            }
            return students;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}

