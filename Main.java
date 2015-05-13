import java.io.IOException;

/*
    Before start the program your need add the library "jyaml-1.3.jar".
*/

public class Main {

    public static void main(String[] args) throws IOException {

        // Declaring random array with the numbers which exactly repeat 2-x, but there is one single number.
        int array [] = {45, 10, 16, 25, 50, 43, 2, 2, 51, 43, 50, 25, 16, 10, 45};

        LogicImplementationTask methods = new LogicImplementationTask();
        System.out.println("Creating yaml file with array: ");
        printArray(array);
        methods.generateYamlFile(array); // generate file in Yaml format with array
        System.out.println("Reading data from yaml file.");
        int[] numbersFromFile = methods.readYamlFile(); // reading data from Yaml file, find a single number and print one to console
        int singleNumber = methods.findSingleNumber(numbersFromFile);
        System.out.println("Find single number.");
        System.out.println("Single number = " + singleNumber);

    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");;
        }
        System.out.println();
    }

}
