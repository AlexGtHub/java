package ui;
import businessLogic.inventoryManager;
import data.Painting;
import data.AntiqueShop;
import data.Item;

import java.util.Scanner;


public class UserInterface {
    public void showMenu(){

            System.out.println("===================================");
            System.out.println("            ¡AntiqueSop!");
            System.out.println("===================================");
            System.out.println("1. See antiques");
            System.out.println("2. Exit");
            System.out.println("===================================");

    }

    public void readOption(){
        while (true) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("=> ");

        String option = myobj.nextLine();
    
        if(option.equals("1")){

            showItems(option);
            System.exit(0);
        }
        if(option.equals("2")){
            System.exit(0);
        }
        if(Integer.parseInt(option) < 1 || Integer.parseInt(option) > 2){
            wrongOption(option);
        }
    }

    }

    public void wrongOption(String option){
        System.out.println("=> "+option+ " is not in menu");
    }

    public void showItems(String option){
        AntiqueShop wantToSee = new AntiqueShop();
        wantToSee.ShowAllAntiques();  
    }
        
}
    

