
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scan = new Scanner(System.in);
        Map<String, Bird> map = new HashMap<String, Bird>();
        Database database = new Database();
        boolean condition = true;
        while (condition) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                map.put(name, bird);
                database.add(bird);
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String obvname = scan.nextLine();
                //Checks the database if there is a bird with that name
                if (database.nameCheck(obvname)) {
                    map.get(obvname).observe();
                } else {
                    System.out.println("Is not a bird!");

                }
            } else if (command.equals("Statistics")) {
                database.statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String showName = scan.nextLine();
                if (database.nameCheck(showName)) {
                    System.out.println(map.get(showName));
                }
            } else if (command.equals("Quit")) {
                break;
            }

            /*switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = scan.nextLine();
                    Bird bird = new Bird(name, latinName);
                    map.put(name, bird);
                    database.add(bird);
                    break;
                case "Observation":
                    System.out.print("What was observed:? ");
                    String obvname = scan.nextLine();
                    //Checks the database if there is a bird with that name
                    if(database.nameCheck(obvname)) {
                        map.get(obvname).observe();
                        break;
                    } else {
                        System.out.println("Is not a bird!");
                        break;
                    }
                case "Statistics":
                    database.statistics();
                    break;
                case "Show":
                    System.out.print("What? ");
                    String showName = scan.nextLine();
                    if(database.nameCheck(showName)) {
                        System.out.println(map.get(showName));
                    }
                    break;
                case "Quit":
                    condition = false;
                    break;
            } */
        }

    }

}
