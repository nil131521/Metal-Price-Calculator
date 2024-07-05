
import java.util.Scanner;

public class MetalPriceCalculator {
    static  void  metalpricecalculator(int value){
        
        
        
        switch (value) {
            case 1:
                Scanner sc2  = new Scanner(System.in);
                System.out.println("Enter how much gram gold..");
                int goldgram = sc2.nextInt();

                Scanner sc3  = new Scanner(System.in);
                System.out.println("Enter how Much Carret..");
                int carret = sc3.nextInt();
                if (carret==24) {
                    System.out.println("Price of " + goldgram+" Carret Gold Is " +(goldgram*7264) + " Rupees");
                } else if 
                    (carret==22) {
                        System.out.println("Price of " + goldgram+" Carret Gold Is " +(goldgram*6654) + " Rupees");
                } 
                else {
                    System.out.println("Price of " + goldgram+" Carret Gold Is " +(goldgram*5482) + " Rupees");
                }
                break;
            case 2:
                Scanner sc4  = new Scanner(System.in);
                System.out.println("Enter how much gram Platinum..");
                int platinum = sc4.nextInt();
                System.out.println("Price of " + platinum+" gm Platinum " +(platinum*2693) + " Rupees");
                break;
            case 3:
                Scanner sc5  = new Scanner(System.in);
                System.out.println("Enter how much gram Palladium..");
                int palladium = sc5.nextInt();
                System.out.println("Price of " + palladium+" gm Palladium " +(palladium*7325) + " Rupees");
                break;
            case 4:
                Scanner sc6  = new Scanner(System.in);
                System.out.println("Enter how much Kg Titanium..");
                int titanium = sc6.nextInt();
                System.out.println("Price of " + titanium+" Kg Titanium " +(titanium*5500) + " Rupees");
                break;
            case 5:
                Scanner sc7  = new Scanner(System.in);
                System.out.println("Enter how much gram Silver..");
                int silver = sc7.nextInt();
                System.out.println("Price of " + silver+" gm Silver " +(silver*90.7) + " Rupees");
                break;
            default:
                System.out.println("Enter valid input...");
                throw new AssertionError();
        }
    }
    public static void main(String[] args) {
        System.out.print("Metal Price Calculator........");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select option......");
        System.out.println("1.GOLD PRICE CALCULATE");
        System.out.println("2.PLATINUM PRICE CALCULATE");
        System.out.println("3.PALLADIUM PRICE CALCULATE");
        System.out.println("4.TITANIUM PRICE CALCULATE ");
        System.out.println("5.SILVER PRICE CALCULATE");
        System.out.println();
        System.out.println();
        System.out.println("Choice Which Metal Price you Want to Know ?");
        int userInput = sc.nextInt();
        System.out.println("\n");
        metalpricecalculator(userInput);
        System.out.println("\n");
        System.out.println("Thanks........");
    }
}
