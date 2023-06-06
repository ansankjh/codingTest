import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	
    	if(h>=0 && h<=23 && m>=0 && m<=59) {
    		// h에 영향을 미침
    		if(m<45) {
    			// h 가 0
    			if(h == 0) {
    				System.out.println((h+24)-1 + " " + ((m+60)-45));
    			} else {
    				System.out.println(h-1 + " " + ((m+60)-45));
    			}
    		// h에 영향을 안미침
    		} else if(m>=45) {
    			// h가 0
    			if(h == 0) {
    				System.out.println(h + " " + (m-45));
    			} else {
    				System.out.println(h + " " + (m-45)); 
    			}
    		}
    	} else {
    		System.out.println("에러임");
    	}
    }
}