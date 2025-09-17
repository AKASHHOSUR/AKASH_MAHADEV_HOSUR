import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int range = sc.nextInt();
    int limit = (a % 2 == 0) ? a - 1 : a;

    for (int i = 1; i <= limit * 2; i += 2) {
      if (i < limit * 2) {
        System.out.print(i + ", ");
      } else {
        System.out.print(i);
      }
    }
    sc.close();
  }
}
