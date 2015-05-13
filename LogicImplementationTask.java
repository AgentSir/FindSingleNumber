import org.ho.yaml.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogicImplementationTask {


    //File's name
    final String NAME = "Yaml.txt";

    //Path to folder with project "SysGearsTasks" on computer
//    final String PATCH_TO_THE_FOLDER = "/home/sergey/IdeaProjects/SysGearsTasks/src/Task_1/";
    final String PATCH_TO_THE_FOLDER = System.getProperty("user.dir");


    // Method which generates a file and writes there the array in YAML-format with using YamlEncorder
    public void generateYamlFile(int [] array) throws IOException {

        Yaml.dump(array, new File(PATCH_TO_THE_FOLDER + NAME));

    }

    // Method which read a file in YAML-format with using YamlDecoder and run method "findSingleNumber"
    public int [] readYamlFile () throws FileNotFoundException {

        return (int[]) Yaml.load(new File(PATCH_TO_THE_FOLDER + NAME));

    }

    // Method for find the number without duplicates and print result to console
    public int findSingleNumber(int [] array){

        int singleNumber = 0;
        for (int arr : array){
            singleNumber = singleNumber ^ arr;
        }
        return singleNumber;

    }

}