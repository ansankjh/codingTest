import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    	Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        ArrayList<Integer> bNum = new ArrayList<Integer>(3);
        
        while(b > 0) {
        	bNum.add(b % 10);
        	b /= 10;
        }
        
        System.out.println(a * bNum.get(0));
        System.out.println(a * bNum.get(1));
        System.out.println(a * bNum.get(2));
        System.out.println(a * Integer.valueOf(bNum.get(2).toString() + bNum.get(1).toString() + bNum.get(0).toString()));
    }
}