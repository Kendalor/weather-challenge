package de.exxcellent.challenge;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {

        // Your preparation code …
        String path="C:\\Users\\Kendalor\\IdeaProjects\\programming-challenge\\src\\main\\resources\\de\\exxcellent\\challenge\\";
        DataFrame df1 = new DataFrame();
        DataFrame df2 = new DataFrame();

        df1.read_csv(path+"weather.csv");
        df1.addDiffColumn("diff","MxT","MnT");

        df2.read_csv(path+"football.csv");
        df2.addDiffColumn("diff","Goals","Goals Allowed");



        String dayWithSmallestTempSpread = df1.getColumn("Day").getValueAt(df1.getColumn("diff").indexOfMin());     // Your day analysis function call …
        String teamWithSmallesGoalSpread = df2.getColumn("Team").getValueAt(df2.getColumn("diff").indexOfMin());; // Your goal analysis function call …

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
    }
}
