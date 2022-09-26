import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task{
    public static void main(String[] args) {
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(
                "input.txt"));
            String line = reader.readLine();
            while(line != null){
                
                String lineNumbers = line.replaceAll("[^0-9]+", " "); // replace letter sections with emptys spaces
                //System.out.println(Arrays.asList(lineNumbers.trim().split(" "))); // extract all numbers from array to an array
                for(String i: Arrays.asList(lineNumbers.trim().split(" "))){
                    if(Integer.parseInt(i) >= 10){
                        System.out.println(line);
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}