import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, this is a file demo!\n");
            fw.write("Writing multiple lines is easy.");
            fw.close();

            // Read from file
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}