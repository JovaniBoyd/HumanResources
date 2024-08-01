
/*
Jovani Boyd
9/29/2023
2251 Interm Programming
*/


import com.sun.source.tree.ImportTree;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;


import java.io.FileWriter; //Needed for writing to a file.

public class Main {


    public static void main(String[] args) {


        Path path = Paths.get(args[0]);
        Scanner fileIn = null;
        PersonSet characters = new PersonSet();
        PersonOrderedSet orderedCharacters = new PersonOrderedSet();
        PersonImperialSet impCharacters = new PersonImperialSet();

      /*  // testing equals method
        Person c1 = new Person("Bob",10, 15);
        Person c2 = new Person("Bob",10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }*/


        try {
            fileIn = new Scanner(path);
        } catch (IOException e) {
            System.out.println("error IO exception: " + e.getMessage());
            System.exit(1);
        }
        String name = "";
        double height = 1.0, weight = 1.0;

        try {
            fileIn.nextLine(); // strip first line
            while (fileIn.hasNext()) {// to avoid errors I had to change .hasNextLine to .hasNext

                name = fileIn.next();
                height = fileIn.nextInt();
                weight = fileIn.nextInt();

                double impHeight = height;
                double impWeight = ((double) weight);
           //     System.out.println(impHeight);// testing
                Person person = new Person(name, height, weight);
                Person p2 = new Person(name, height, weight);
                Person p3 = new Person(name, height, weight);

                characters.add(person);
                orderedCharacters.add(p2);
                impCharacters.add(p3);

            }
            //    Collections.sort(characters);


            System.out.println(characters); // Test print

            System.out.println(orderedCharacters);

            System.out.println(impCharacters);


        } catch (java.util.InputMismatchException e) {
            System.out.println("Input did not match\n");
            e.printStackTrace();
            System.out.println("\n" + e + "\n");
        }
        fileIn.close();


        //Writing to a file --- taken and modified from FileReader example
        try {
            FileWriter myWriter = new FileWriter("hr_imperial_set_output.txt");
            FileWriter myWriter2 = new FileWriter("hr_ordered_set_output.txt");

            myWriter.write("Name    Height(inches)      Weight(lbs)"+"\n");
            myWriter.write(impCharacters.toString()); //was having trouble here than changed to .toString() to show list and it worked

            myWriter2.write("Name   Height(cm)   Weight(kg)"+"\n");
            myWriter2.write(orderedCharacters.toString());



            myWriter.close();
            myWriter2.close();
            System.out.println("Successfully wrote to the files.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}
