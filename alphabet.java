import java.util.Scanner;
public class Main{
 public static void main(String[]args){
     
    Scanner scanner=new Scanner(System.in);
    int str='a';
    System.out.println("Input:");
    if (Character.isAlphabetic(str)){
        System.out.println("Alplabet");
    }else{	
        System.out.println("not a Alphabet");
    }
 }    
}
