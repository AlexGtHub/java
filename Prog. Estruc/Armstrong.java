import java.util.Scanner;

public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Type the number: ");
    Integer number = Integer.parseInt(obj.nextLine());
    Integer firstdigit = ((number/100));
    Integer seconddigit = ((number/10) % 10);
    Integer thirddigit = ((number%100)%10);

    if (Math.pow(firstdigit, 3) + Math.pow(seconddigit, 3) + Math.pow(thirddigit, 3) == number){
        System.out.println(true);
    } else{
        System.out.println(false);
    }
}