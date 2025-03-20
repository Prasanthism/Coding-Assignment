import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        input1 = input1.replaceAll("\\s", "").toLowerCase();
        input2 = input2.replaceAll("\\s", "").toLowerCase();
        if (input1.length() != input2.length())
        {
            System.out.println("false");

        }
        else
        {
            char[] ch1 = input1.toCharArray();
            char[] ch2 = input2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("true");
            }
        }
        
        sc.close();

    }
    
}
