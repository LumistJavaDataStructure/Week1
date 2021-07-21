import java.util.Scanner;

public class VendingMachineSolution {
    //Declare the global variables here
    private static final int TOONIES = 5;
    private static final int LOONIES = 5;
    private static final int QUARTERS = 20;
    private static final int DIMES = 30;
    private static final int NICKELS = 40;

    public static void displayMenu(){
        System.out.println("Welcome to the Lumist virtual Vending Machine.");
        System.out.println("Here are your options:");
        System.out.println("1. Candy bar $2.95");
        System.out.println("2. Cookies $3.90");
        System.out.println("3. Soda $4.00");
        System.out.println("4. Chips $3.90");
        System.out.println("5. No snacks for me today!");
    }

    public static int getSnackPrice(int choice){
        if(choice == 1){
            return 295;
        }
        else if(choice == 2){
            return 390;
        }
        else if(choice == 3){
            return 400;
        }
        else if(choice == 4){
            return 390;
        }
        else{
            return 0;
        }
    }

    public static int getNumOfCoins(int amountNeeded, int valueOfCoin, int coinsAvailable){
        int needed = amountNeeded / valueOfCoin;
        if(needed > coinsAvailable){
            return coinsAvailable;
        }
        else{
            return needed;
        }
    }

    public static boolean computeAndDisplayChange(int change){
        int toChange = change;
        int numOfToonies = getNumOfCoins(toChange, 200, TOONIES);
        toChange -= 200 * numOfToonies;
        int numOfLoonies = getNumOfCoins(toChange, 100, LOONIES);
        toChange -= 100 * numOfLoonies;
        int numOfQuarters = getNumOfCoins(toChange, 25, QUARTERS);
        toChange -= 25 * numOfQuarters;
        int numOfDimes = getNumOfCoins(toChange, 10, DIMES);
        toChange -= 10 * numOfDimes;
        int numOfNickels = getNumOfCoins(toChange, 5, NICKELS);
        toChange -= 5 * numOfNickels;
        if(toChange == 0){
            System.out.println("Here is your change:");
            System.out.println("Toonies x " + numOfToonies);
            System.out.println("Loonies x " + numOfLoonies);
            System.out.println("Quarters x " + numOfQuarters);
            System.out.println("Dimes x " + numOfDimes);
            System.out.println("Nickels x " + numOfNickels);
            return true;
        }
        else{
            return false;
        }
    }

    public static void operateMachine(){
        //Display the menu
        displayMenu();
        //Create a Scanner to read input from user
        System.out.println("Please select your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if(getSnackPrice(choice) <= 0){
            System.out.println("Nothing for you today. Thank you for stopping by.");
        }
        else{
            System.out.println("The item of your choice costs " + getSnackPrice(choice) + " cents");
            System.out.println("Insert your money : $");
            double moneyInserted = input.nextDouble();
            int moneyInsertedInCent = (int) moneyInserted * 100;
            System.out.println("You inserted " + moneyInsertedInCent + " cents");
            int change = moneyInsertedInCent - getSnackPrice(choice);
            if(change < 0){
                System.out.println("You do not have enough money. Come by another time!");
            }
            else if(change > 2500){
                System.out.println("The machine does not have enough coins for your change. Come by another time!");
            }
            else if(computeAndDisplayChange(change)){
                System.out.println("It was a pleasure doing business with you!");
            }
            else if(!computeAndDisplayChange(change)){
                System.out.println("We do not accept pennies. Come by another time!");
            }
        }
    }

    public static void main(String[] args){
        operateMachine();
    }
}
