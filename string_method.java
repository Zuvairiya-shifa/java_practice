import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String spl="!@#$%^&*()_+";
        if (input.matches("[A-Za-z]+")){
            System.out.println("alphabet");

        }
        else if (input.matches("[0-9]+")){
            System.out.println("number");

        }
        else if (input.matches("["+spl+"]+")){
            System.out.println("special character");
        }
        else{
            System.out.println("nohting");
        }

    }
}