package de.exxcellent.challenge;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Representation of a Single Column of a DataSet for ease of Computation
 * Not a perfect way but enough for the time and the demo I decided
 */
public class Column {

    private String name;
    private ArrayList column;
    //Primitive Types would be more efficient, but ArrayList solves the problem
    // of different Types of variables for each Column


    public Column(String name) {
        this.name = name;
        column= new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Object o){
        this.column.add(o);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", column=" + column +
                '}';
    }

    public E getValueAt(int index){
        return column.get(index);
    }

    public int indexOf(Object o){
        return column.indexOf(Object o);
    }

    public E minValue(){
        return Collections.min(column);
    }

    public E maxValue(){
        return Collections.max(column);
    }

    public int indexOfMin(){
        return column.indexOf(Collections.min(column));
    }

    public int indexOfMax(){
        return column.indexOf(Collections.max(column));
    }


}