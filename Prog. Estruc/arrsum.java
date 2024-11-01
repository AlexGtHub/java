import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public static void main(String[] args){
    Integer acumsum = 0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Type your array: ");
    String arreglo = obj.nextLine();
    //System.out.println(arreglo);
    List<String> myList = Arrays.asList(arreglo.split(","));
    for (int i = 0; i < myList.size(); i++){
        Integer num = Integer.parseInt(myList.get(i));
        //System.out.println(num);
        if (num > 0){
            acumsum = acumsum + num;
        }
    
    }
    System.out.println(acumsum);
}