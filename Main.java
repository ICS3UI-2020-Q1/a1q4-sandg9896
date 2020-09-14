import java.util.Scanner;
/**
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // help grade 9s calculate the slope of a line given two points
    String name;
   System.out.println("Enter value for X1:");
    // Creates a Scanner used for input
    Scanner input = new Scanner(System.in);
     double X1 = input.nextInt();
    System.out.println("Enter value for Y1:");
     double Y1 = input.nextInt();
    System.out.println("Enter value for X2:");
     double X2 = input.nextInt();
    System.out.println("Enter value for Y2:");
     double Y2 = input.nextInt();

      System.out.println("The slope of the line is " +  (Y2 -Y1)/(X2 - X1) );


  }
}
