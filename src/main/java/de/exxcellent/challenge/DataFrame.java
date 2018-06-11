package de.exxcellent.challenge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Representation of a Data Set
 */
puplic class DataFrame {

    private List<Column> data;

    public List<Column> getData() {
        return data;
    }

    public void setData(List<Column> data) {
        this.data = data;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "DataFrame{" +
                "data=" + data +
                '}';
    }


    public from_csv(String filename){

    }
}