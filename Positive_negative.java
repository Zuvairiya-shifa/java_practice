import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();
        if (num>0){
            System.out.println("positive");
        }
        else if (num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}