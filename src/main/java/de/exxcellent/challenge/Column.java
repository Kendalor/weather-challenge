package de.exxcellent.challenge;
import java.util.ArrayList;
import java.util.Collections;



/**
 * Representation of a Single Column of a DataSet for ease of Computation
 * Not a perfect way but enough for the time and the demo I decided
 */
public class Column {

    private String name;
    private ArrayList<String> column;
    //Primitive Types would be more efficient, but ArrayList solves the problem
    // of different Types of variables for each Column


    public Column(String name) {
        this.name = name;
        column= new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(String o){
        this.column.add(o);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", column=" + column +
                '}';
    }

    public String getValueAt(int index){
        return column.get(index);
    }

    public int indexOf(String o){

        return column.indexOf(o);
    }

    public String minValue(){
        return Collections.min(column);
    }

    public String maxValue(){
        return Collections.max(column);
    }

    public int indexOfMin(){
        return column.indexOf(Collections.min(column));
    }

    public int indexOfMax(){
        return column.indexOf(Collections.max(column));
    }

    public String[] getValues(){
        return column.toArray(new String[0]);
    }


}