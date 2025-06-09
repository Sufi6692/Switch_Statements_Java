import java.util.Scanner;

public class Weekdays_Weekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Day = input.nextInt();


// using only switch statement
//        switch (Day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//

        //Using Enhanced Switch
        switch (Day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
