package businessLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.Item;
import data.Painting;
import data.Statue;
import data.Vase;

public class inventoryManager {
    protected String fileName = "items.txt";
    protected List<Item> ListOfItem = new ArrayList<>();
    
    public void readingData(){
        File inFile = new File(this.fileName);
        try {
            Scanner in = new Scanner(inFile);
            readingRecords(in);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found " + fileName);
            System.exit(0);
        }
    }

    public void readingRecords(Scanner sc){

        try {
            BufferedReader lector = new BufferedReader(new FileReader(fileName));
            String myLine="";
    
            while((myLine=lector.readLine())!= null){
                String[] allLines=myLine.split(", ");

                if(allLines[0].equals("Painting")){
                    int value = Integer.parseInt(allLines[2]);
                    String creator = allLines[1];
                    int height = Integer.parseInt(allLines[3]);
                    int width = Integer.parseInt(allLines[4]);
                    Boolean isWatercolour = Boolean.parseBoolean(allLines[5].trim());
                    Boolean isFramed = Boolean.parseBoolean(allLines[6].trim());

                    ListOfItem.add(new Painting(value, creator, height, width, isWatercolour, isFramed));
                }

                if(allLines[0].equals("Vase")){
                    int value = Integer.parseInt(allLines[2]);
                    String creator = allLines[1];
                    int height = Integer.parseInt(allLines[3]);
                    String material = allLines[4];

                    ListOfItem.add(new Vase(value, creator, height, material));
                }

                if(allLines[0].equals("Statue")){
                    int value = Integer.parseInt(allLines[2]);
                    String creator = allLines[1];
                    int height = Integer.parseInt(allLines[3]);
                    String colour = allLines[4];

                    ListOfItem.add(new Statue(value, creator, height, colour));
                }
            }

        } catch (IOException e) {
            System.out.println("not found" + e.getMessage());
            
        }

    }

    public void getAllAntiques(){
        for(Item i: ListOfItem){
           System.out.println(i);
        }
    }

    public void writingRecords(){

    }
}
