package de.exxcellent.challenge;

/**
 * Representation of a Single Column of a DataSet for ease of Computation
 * Not a perfect way but enough for the time and the demo I decided
 */
puplic class Column extends ArrayList {

    private String name;
    //Primitive Types would be more efficient, but ArrayList solves the problem
    // of different Types of variables for each Column
    private ArrayList() content;

    public Column(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}