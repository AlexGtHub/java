import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        lecture profesor = new lecture("Jairo Hernán Aponte Melo", "11111111", "department of mathematics and statistics", "Object-Oriented-Programming");

        System.out.println("User: "+profesor.getName() +" || "+ profesor.getFaculty() +" || "+  profesor.getCourse());

        subject sub = new subject();

        Scanner scan = new Scanner(System.in);

        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;

        List<Double> notasJuan = null;
        List<Double> notasCarlos = null;
        List<Double> notasLucia = null;

        List<Double> grades1 = new ArrayList<>();
        List<Double> grades2 = new ArrayList<>();
        List<Double> grades3 = new ArrayList<>();

        List<String> activities = new ArrayList<>(Arrays.asList("Homeworks", "Quizzes", "Exam1","Exam2", "Plan"));
        List<Object> listOfLists = new ArrayList<>();


        student stu = new student("123", "juan", "18", 0, notasJuan);
        student stu2 = new student("456", "carlos", "16", 0, notasCarlos);
        student stu3 = new student("789", "lucia", "19", 0,notasLucia);

        while (true) {
            System.out.println("==========================");
            System.out.println("1. Register grades");
            System.out.println("2. Students grades");
            System.out.println("3. Calculate final grade");
            System.out.println("4. Exit");
            System.out.println("==========================");

            Scanner myopt = new Scanner(System.in);
            System.out.print("=> Type your option: ");
            String selecOption = myopt.nextLine();

            if(Integer.parseInt(selecOption) <= 0 | Integer.parseInt(selecOption) >= 5){
                System.out.println("Invalid Option");
            }


            if(Integer.parseInt(selecOption)==1){
                System.out.println("==========================");
                System.out.println(stu.getName() +" | "+ stu2.getName() +" | "+ stu3.getName());
                System.out.println("==========================");
    
                Scanner frtop = new Scanner(System.in);
                System.out.print("=> Type the student name: ");
                String frtoption = myopt.nextLine();


                if (frtoption.equals("juan")){
                    grades1.clear();
                    Scanner capturejuan = new Scanner(System.in);
                    double n1,n2,n3,n4,n5;
                    System.out.println("==================================");
                    System.out.println("Homeworks|Quizzes|Exam1|Exam2|Plan");
                    System.out.println("==================================");
                    n1=capturejuan.nextDouble();
                    n2=capturejuan.nextDouble();
                    n3=capturejuan.nextDouble();
                    n4=capturejuan.nextDouble();
                    n5=capturejuan.nextDouble();
                    grades1.add(n1);
                    grades1.add(n2);
                    grades1.add(n3);
                    grades1.add(n4);
                    grades1.add(n5);
                    stu.setGrades(grades1);
                    notasJuan = grades1;

                }

                if (frtoption.equals("carlos")){
                    grades2.clear();
                    Scanner capturecarlos = new Scanner(System.in);
                    double n1,n2,n3,n4,n5;
                    System.out.println("==================================");
                    System.out.println("Homeworks|Quizzes|Exam1|Exam2|Plan");
                    System.out.println("==================================");
                    n1=capturecarlos.nextDouble();
                    n2=capturecarlos.nextDouble();
                    n3=capturecarlos.nextDouble();
                    n4=capturecarlos.nextDouble();
                    n5=capturecarlos.nextDouble();
                    grades2.add(n1);
                    grades2.add(n2);
                    grades2.add(n3);
                    grades2.add(n4);
                    grades2.add(n5);
                    stu2.setGrades(grades2);
                    notasCarlos = grades2;
                }

                if (frtoption.equals("lucia")){
                    grades3.clear();
                    Scanner capturelucia = new Scanner(System.in);
                    double n1,n2,n3,n4,n5;
                    System.out.println("==================================");
                    System.out.println("Homeworks|Quizzes|Exam1|Exam2|Plan");
                    System.out.println("==================================");
                    n1=capturelucia.nextDouble();
                    n2=capturelucia.nextDouble();
                    n3=capturelucia.nextDouble();
                    n4=capturelucia.nextDouble();
                    n5=capturelucia.nextDouble();
                    grades3.add(n1);
                    grades3.add(n2);
                    grades3.add(n3);
                    grades3.add(n4);
                    grades3.add(n5);
                    stu3.setGrades(grades3);
                    notasLucia = grades3;
                }

            }

            if(Integer.parseInt(selecOption)==2){
                System.out.println(stu.getName()+ " grades: " + notasJuan); 
                System.out.println(stu2.getName()+ " grades: " + notasCarlos); 
                System.out.println(stu3.getName()+ " grades: " + notasLucia);  
            }

            if(Integer.parseInt(selecOption)==3 && stu.getGrades() != null && stu2.getGrades() != null && stu3.getGrades() != null){

                stu.setGpa(sub.calculateGetGpa(grades1.get(0),  grades1.get(1), grades1.get(2), grades1.get(3), grades1.get(4)));
                stu2.setGpa(sub.calculateGetGpa(grades2.get(0),  grades2.get(1), grades2.get(2), grades2.get(3), grades2.get(4)));
                stu3.setGpa(sub.calculateGetGpa(grades3.get(0),  grades3.get(1), grades3.get(2), grades3.get(3), grades3.get(4)));
 

                System.out.println("Grade Point Average of " + stu.getName()+" is "+ + stu.getGpa());
                System.out.println("Grade Point Average of " + stu2.getName()+" is "+ + stu2.getGpa());
                System.out.println("Grade Point Average of " + stu3.getName()+" is "+ + stu3.getGpa());

            }else{
                System.out.println("You have to update all the grades first");
            }

            if(Integer.parseInt(selecOption)==4){
                break;
            }
        }
    }
}
