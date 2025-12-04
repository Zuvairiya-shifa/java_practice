import java.util.Scanner;
public class string_method{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if (input.IsAlphabetic()){
            System.out.println("alphabet");

        }
        else if (input.IsNumeric()){
            System.out.println("number");

        }
        string spl="!@#$%^&*()_+";
        else if (input.contains(spl)){
            System.out.println("special character");
        }

    }
}