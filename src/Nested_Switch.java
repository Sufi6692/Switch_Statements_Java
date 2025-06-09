import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter your Emp ID : ");
        int EmpID = input.nextInt();
        System.out.print("Enter process of Emp in UPPER CASE : ");
        String  Process = input.next();
/*
        switch (EmpID){
            case 1:
                System.out.println("Sufi");
                switch (Process){
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
                break;
            case 2:
                System.out.println("Qalandar");
                switch (Process){
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
                break;
            case 3:
                System.out.println("Ali");
                switch (Process){
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
                break;
            default:
                System.out.println("Enter a valid a EmpID");
        }
        */

        //Enhanced Switch
        switch (EmpID) {
            case 1 -> {
                System.out.println("Sufi");
                switch (Process) {
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
            }
            case 2 -> {
                System.out.println("Qalandar");
                switch (Process) {
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
            }
            case 3 -> {
                System.out.println("Ali");
                switch (Process) {
                    case "SAMSUNG":
                        System.out.println("IT Dep");
                        break;
                    case "MESHO":
                        System.out.println("MARKETING Dep");
                        break;
                    case "GOOGLE":
                        System.out.println("MANAGEMENT Dep");
                        break;
                    default:
                        System.out.println("Enter a valid process");
                }
            }
            default -> System.out.println("Enter a valid a EmpID");
        }


    }
}
