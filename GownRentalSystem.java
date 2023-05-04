import java.util.Scanner;
public class GownRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean transaction = true;
        int price[] = {500,550,600,650,700,750};
        int total = 0;
        
        System.out.print("Welcome to Bacani`s Gown Rental Shop!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Rent a gown\n");
        System.out.print("2.) Return a gown\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\n\tAVAILABLE GOWNS\n\n");
                System.out.print("GOWNS\t\t\tPRICE\n\n");
                System.out.print("1.) Ball Gown\t\tP 500\n\n");
                System.out.print("2.) Shealth Gown\tP 550\n\n");
                System.out.print("3.) A-Line Gown \tP 600\n\n");
                System.out.print("4.) Mermaid Gown\tP 650\n\n");
                System.out.print("5.) Empire Style Gown  P 700\n\n");
                System.out.print("6.) Cocktail Dress\tP 750\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter quantity here : ");
                int quantity = input.nextInt();
                
                total += price[userChoice - 1] * quantity;
                
                System.out.print("Do you want to rent more gowns? (y/n): ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU FOR RENTING OUR GOWN/S!\n");
                }
                        
                
                }
                break;
            
            case 2:
                System.out.print("\tGOWNS\n\n");
                System.out.print("1.) Ball Gown\n\n");
                System.out.print("2.) Shealth Gown\n\n");
                System.out.print("3.) A-Line Gown\n\n");
                System.out.print("4.) Mermaid Gown\n\n");
                System.out.print("5.) Empire Style Gown\n\n");
                System.out.print("6.) Cocktail Dress\n\n");
                
                System.out.print("Enter the gown you want to return : ");
                int gown = input.nextInt();
                
                System.out.print("\n\n---SUCCESSFULLY RETURNED---\n");
                break;
                
            case 3:
                System.out.print("\n\nWelcome to Bacani`s Gown Rental Shop!\nAt Bacani`s Gown Rental Shop, we believe that every special occasion deserves a touch of\nelegance and glamour. We are thrilled to offer you a stunning collection of exquisite gowns\nfor rent, carefully curated to make you feel like the belle of the ball.\n");
                break;
                
            case 4:
                System.out.print("\n\n---EXITING---\n");
                break;
            
            default:
                System.out.print("\n\nINVALID CHOICE!\n");
                
        }

    }
}
