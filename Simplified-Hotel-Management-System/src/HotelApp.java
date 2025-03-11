import java.util.Scanner;

import com.duque.Indicators.FrontDesk;

/**
 * HotellApp
 */
public class HotelApp {

    static Scanner sc = new Scanner(System.in);
    static int choice;
    public static void main(String[] args) {
        FrontDesk fd = new FrontDesk();
        
        while (choice != 4) {
                System.out.print("Welcome to the Hotel App\n" +
                                "1. Request Cart\n" +
                                "2. Clean Room\n" +
                                "3. Pick Up Car\n" +
                                "4. Exit\n" +
                                "Enter your choice: ");
                choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of carts: ");
                    int numberOfCarts = sc.nextInt();
                    fd.requestCart(numberOfCarts);
                    break;
            
                case 2:
                    System.out.print("Enter the room number: ");
                    String roomNumber = sc.next();
                    fd.cleanRoom(roomNumber);
                    break;

                case 3:
                    System.out.print("Enter the plate number: ");
                    String plateNo = sc.next();
                    fd.pickUpCar(plateNo);
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}