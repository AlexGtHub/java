import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public static void main(String[] args) {
    
    List<Integer> myList = new ArrayList<>();
    Integer negcounter = 0;
    Integer poscounter = 0;

    for (int i = 0; i < 3; i++){
        Scanner obj = new Scanner(System.in);
        System.out.println("Type a number: ");
        Integer number = Integer.parseInt(obj.nextLine());  
        myList.add(number);

    }
    System.out.println(myList);
    for (int i = 0; i < myList.size(); i++){
        Integer value = myList.get(i);
        if (value < 0){
            negcounter = negcounter + 1;
        }
        if (value > 0){
            poscounter = poscounter + 1;
        }
    }
    System.out.println("there are " + negcounter + " Negative numbers" );
    System.out.println("there are " + poscounter + " Positive numbers" );
}