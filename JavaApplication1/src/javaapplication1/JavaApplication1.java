/*Geoffrey Cunningham
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gwcunningham
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[80];
        int[] scores = new int[80];
        
        String name = "results";
        String sf1;
        sf1 = String.format("Name is ", (Object) names);
        String sf2 = String.format("Score is", Arrays.toString(scores));
        
        System.out.println(sf1);
        System.out.println(sf2);
        
        DataReader(names, scores, args[0]);
    }

    public static void DataReader(String[] names, int[] scores, String filename) {
        try {
            Scanner reader = new Scanner(new File(filename));
            int currentIndex = 0;
            while (reader.hasNext()) {
                String[] line = reader.nextLine().split(" ");

                names[currentIndex] = line[0];
                scores[currentIndex] = Integer.parseInt(line[1]);

                currentIndex++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Unable to read file in DataReader");
        }
            
        
    }
}
