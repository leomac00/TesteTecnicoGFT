import java.util.Arrays;
import java.util.Scanner;

public class GetTenInputs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[10];
        int num;
        int count = 0;

        //Get numbers
        while(count < 10) {
            System.out.println("Digite um número: ");
            num = s.nextInt();
            boolean contains = false;

            for (int i = 0; i < nums.length; i++) {
                if(num == nums[i]) contains = true;
            }
            if(contains) {
                System.out.println("Digite um número não repetido.");
            } else {
            nums[count] = num;
            count++;
            }
        }

        //Average
        int avg = 0;
        for (int i = 0; i < nums.length; i++) {
            avg += nums[i];
        }
        avg = avg / 10;
        //above 10
        String abv10 = "";
        int count10 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10) {
                abv10 += " " + nums[i];
            count10++;
            }
        }
        //above 50
        String abv50 = "";
        int count50 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 50){
                abv50 += " " + nums[i];
            count50++;
            }
        }

        System.out.println("O maior número é: " + getHighest(nums,10));
        System.out.println("O menor número é: " + getLowest(nums, 10));
        System.out.println("A média é: " + avg);
        System.out.println("Foram encontrados "+ count10 + " números acima de 10 e estes são eles: " + abv10);
        System.out.println("Foram encontrados "+ count50 + " números acima de 50 e estes são eles: " + abv50);

    }
    //highest number
    public static int getHighest(int[] a, int total){
        int temporary;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] < a[j])
                {
                    temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
        return a[0];
    }
    //lowest number
    public static int getLowest(int[] a, int total){
        int temporary;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
        return a[0];
    }
}
