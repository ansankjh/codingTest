import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	// x, y가 모두 양수면 1사분면
    	if(x > 0 && y > 0) {
    		System.out.println("1");
    	} else if(x <0 && y > 0) { // x가 음수 y가 양수면 2사분면
    		System.out.println("2");
    	} else if(x < 0 && y < 0) { // x,y와 모두 음수면 3사분면
    		System.out.println("3");
    	} else if(x > 0 && y < 0) { // x 양수 y 음수면 4사분면
    		System.out.println("4");
    	}
    }
}