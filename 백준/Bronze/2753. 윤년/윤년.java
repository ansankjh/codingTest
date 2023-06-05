import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int day = sc.nextInt();
    	
    	// 윤년이면 1 아니면 0 y는 1~4000
    	
    	if(day % 400 == 0 || (day % 4 == 0 && day % 100 != 0)) {
    		System.out.println("1");
    	} else {
    		System.out.println("0");
    	}
    }
}