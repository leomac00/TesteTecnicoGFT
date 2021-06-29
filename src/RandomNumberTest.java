import java.util.Scanner;

public class RandomNumberTest {
    public static void main(String[] args) {
        final int num = (int) (Math.random() * 10);
        Scanner s = new Scanner(System.in);
        System.out.println(num);
        System.out.println("Advinhe o número gerado! Digite ele:");
        int ans = s.nextInt();
        while (ans != num) {
            System.out.println("Número errado, digite outro: ");
            ans = s.nextInt();
        }
        System.out.println("Número correto!");
    }
}
