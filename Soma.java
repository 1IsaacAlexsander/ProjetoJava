import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número: ");
      Integer num1 = sc.nextInt();
      System.out.println("Digite outro número: ");
      Integer num2 = sc.nextInt();
      System.out.println(num1 + num2);
    }
}