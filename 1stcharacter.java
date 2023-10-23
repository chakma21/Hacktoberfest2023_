import java.util.Scanner;
public class character {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word:");
        char ch=sc.next().charAt(0);
        System.out.println("Printing the first character:");
        System.out.println(ch);
    }
    
}
