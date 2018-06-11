package de.exxcellent.challenge;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.lang.ArrayUtils;
/**
 * Representation of a Data Set
 */
public class DataFrame {

    private HashMap<String,Column> data;

    public DataFrame() {
        data= new HashMap<String,Column>();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "DataFrame{" +
                "data=" + data +
                '}';
    }

    public

    public void read_csv(String filename){
        // Got this from: https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
        // A good file reader is which dynamically creates primitive types out read strings would be what I want later
        String csvFile = filename;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        boolean readHeader= true;
        String[] header = {""};
        int index=0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                if(readHeader){
                    header = line.split(cvsSplitBy);
                    System.out.println("Reading Header of Length: "+ header.length);
                    for(int i=0; i< header.length; i++){
                        data.put(header[i], new Column(header[i]));
                    }
                    readHeader= false;
                } else {
                    String[] row = line.split(cvsSplitBy);
                    for (int i = 0; i < row.length; i++) {
                        data.get(header[i]).add(ArrayUtils.toObject(row[i]));
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
    }
}