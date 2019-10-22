
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {

            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add(new Student(name, studentnumber));

        }
        for (Student stdnt : list) {
            System.out.println(stdnt);
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student stdnt : list) {
            if (stdnt.getName().contains(search)) {
                System.out.println(stdnt);
            }
        }
    }
}
