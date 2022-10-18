import java.util.Scanner;
public class CtoF {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean done = false;

    do {
      System.out.print("Input temperature in Celsius: ");

      if (in.hasNextDouble()) {
        double celsius = in.nextDouble();
        double fahrenheit = celsius * (9.0 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        done = true;
      } else {
        String invalid = in.nextLine();
        System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      }
    } while (!done);
  }
}