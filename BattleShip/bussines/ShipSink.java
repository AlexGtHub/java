import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ShipSink {
    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private int numOfGuesses = 0;

    private void setUpGame(){

        Ship one = new Ship();
        one.setName("Charlotte");
        Ship two = new Ship();
        two.setName("Avenger");
        Ship three = new Ship();
        three.setName("Hancock");
        
        ships.add(one);
        ships.add(two);
        ships.add(three);

        System.out.println("Your goal is to sink three ships");
        System.out.println("Charlotte, Avenger, Hancock");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Ship ship : ships){
            ArrayList<String> newLocation = helper.placeShip(3);
            ship.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){

        String[][] grid = {
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■", "■", "■"}

        };

        String[] numbers = {"0","1","2","3","4","5","6"};

        System.out.print("A");
        System.out.println(Arrays.toString(grid[0]));
        System.out.print("B");
        System.out.println(Arrays.toString(grid[1]));
        System.out.print("C");
        System.out.println(Arrays.toString(grid[2]));
        System.out.print("D");
        System.out.println(Arrays.toString(grid[3]));
        System.out.print("E");
        System.out.println(Arrays.toString(grid[4]));
        System.out.print("F");
        System.out.println(Arrays.toString(grid[5]));
        System.out.print("G");
        System.out.println(Arrays.toString(grid[6]));
        System.out.print(" ");
        System.out.println(Arrays.toString(numbers));

        List<String> inputUser = new ArrayList<>();

        while (!ships.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");


            if (inputUser.contains(userGuess)){
                System.out.println(userGuess + " is already in the list");
            } else{

            inputUser.add(userGuess);

            String saved = checkUserGuess(userGuess);

            System.out.println(saved);
            

            String letter = String.valueOf(userGuess.charAt(0));
            int numero = Integer.parseInt(String.valueOf(userGuess.charAt(1))); 

            if (numero > 6 || numero < 0){
                System.out.println("number out of range");
            } else{
            if (letter.equals("a" )){
                letter = "0";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("b" )){
                letter = "1";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("c" )){
                letter = "2";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("d" )){
                letter = "3";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("e" )){
                letter = "4";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("f" )){
                letter = "5";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }
            if (letter.equals("g" )){
                letter = "6";
                if (saved.equals("hit") || saved.equals("kill")) {
                    grid[Integer.parseInt(letter)][(numero)] = "X";
                } else {
                    grid[Integer.parseInt(letter)][(numero)] = "O";
                }
            }


            System.out.print("A");
            System.out.println(Arrays.toString(grid[0]));
            System.out.print("B");
            System.out.println(Arrays.toString(grid[1]));
            System.out.print("C");
            System.out.println(Arrays.toString(grid[2]));
            System.out.print("D");
            System.out.println(Arrays.toString(grid[3]));
            System.out.print("E");
            System.out.println(Arrays.toString(grid[4]));
            System.out.print("F");
            System.out.println(Arrays.toString(grid[5]));
            System.out.print("G");
            System.out.println(Arrays.toString(grid[6]));
            System.out.print(" ");
            System.out.println(Arrays.toString(numbers));
            }
        }
    }
        finishGame();
    }

    public String checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for (Ship shipToTest : ships){
            result = shipToTest.checkYourself(userGuess);

            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                ships.remove(shipToTest);
                break;
            } 
        }
        return result;
    }

    private void finishGame(){
        System.out.println("All ships are dead! Your stock is now worthless");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank");
        } else{
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }
    public static void main(String[] args) {
        ShipSink game = new ShipSink();
        game.setUpGame();
        game.startPlaying();
    }
}