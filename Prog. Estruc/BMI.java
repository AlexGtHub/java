
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner objweight = new Scanner(System.in);
        System.out.println("Type your weight: ");
        Double weight = Double.parseDouble(objweight.nextLine());
        Scanner objheight = new Scanner(System.in);
        System.out.println("Type your height: ");
        Double height = Double.parseDouble(objweight.nextLine());  
        
        Double operation = weight / Math.pow(height, 2);

        System.out.println("Your BMI is: " + operation);

        if (operation < 15){
            System.out.println("Very severely underweight");
        }
        if (operation >= 15 & operation < 16){
            System.out.println("Serevely underweight");
        }
        if (operation >= 16 & operation < 18.5){
            System.out.println("Underwight");
        }
        if (operation >= 18.5 & operation < 25){
            System.out.println("Normal (healthy weight)");
        }
        if (operation >= 25){
            System.out.println("Overweight");
        }

    }
}