import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {
    public static void main(String[] args) {
        String fileName = "user.txt";
        // String jsonString = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // jsonString += line;
                for (char i = 0; i < line.length(); i++) {
                    System.out.printf(line.charAt(i) + "");
                }
                // System.out.println(line);
                System.out.printf("\n\n");
                // System.out.println();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // for (int i = 0; i < jsonString.length(); i++) {
        //     System.out.println(jsonString);
        // }
        // System.out.println(jsonString);
    }
}
