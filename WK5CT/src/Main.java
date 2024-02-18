import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        double[] temp = {48.3, 52.5, 62.4, 72.1, 79.8, 87.6, 90.2, 89.7, 83.9, 72.9, 61.2, 51.3};
        boolean done = false;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("January = 1" + "\n" +
                "February = 2" + "\n" +
                "March = 3" + "\n" +
                "April = 4" + "\n" +
                "May = 5" + "\n" +
                "June = 6" + "\n" +
                "July = 7" + "\n" +
                "August = 8" + "\n" +
                "September = 9" + "\n" +
                "October = 10" + "\n" +
                "November = 11" + "\n" +
                "December = 12");
        System.out.println("To see the average temperature for a month please enter a month."+"\n"+ "For the whole year enter 'year'"+"\n"+ "To exit enter 'x': ");
        String monthNum = myObj.nextLine();
            // Read user input
            if (Objects.equals(monthNum, "year")) {
                for (int i = 0; i < month.length; i++)    //length is the property of the array
                    System.out.println(month[i] + " had an average temperature of: " + temp[i] + "°F.");
            } else {
                try {
                    int num = Integer.parseInt(monthNum);
                    System.out.println("In " + month[num - 1] + " the average temperature was: " + temp[num - 1] + "°F.");

                } catch (Exception e) {
                    System.out.println("Try again with 1 - 12, or 'year'.");
            }
        }
    }
}


