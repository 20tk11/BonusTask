import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) throws IOException {

        File dir = new File("Files");
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                BufferedReader inputStream = null;
                String line;
                try {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) {

                        String lineNumbers = line.replaceAll("[^0-9]+", " "); // replace letter sections with empty
                                                                              // spaces
                        // System.out.println(Arrays.asList(lineNumbers.trim().split(" "))); // extract
                        // all numbers from string to an integer array
                        for (String i : Arrays.asList(lineNumbers.trim().split(" "))) {
                            if (Integer.parseInt(i) >= 10) {
                                System.out.println(line);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e);
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }

    }
}