import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int range = sc.nextInt();

    for (int i = 1; i <= range * 2; i += 2) {
      if (i < range * 2) {
        System.out.print(i + ", ");
      } else {
        System.out.print(i);
      }
    }
    sc.close();
  }
}
