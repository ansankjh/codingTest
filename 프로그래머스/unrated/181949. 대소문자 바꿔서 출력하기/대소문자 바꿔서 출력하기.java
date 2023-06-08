import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // 문자 단위로 비교하기위해 문자열을 char배열로 변환
        char[] chArray = a.toCharArray();
        
        // 문자 단위 비교를 위해 char 타입 변수에 배열의 길이만큼 반복하여 저장
        for(int i=0; i<chArray.length; i++) {
            // char 타입 변수에 저장
            char ch = chArray[i];
            // ch변수에 저장된 값이 대문자라면 소문자로 변환
            if(Character.isUpperCase(ch)) {
                chArray[i] = Character.toLowerCase(ch);
            // ch변수에 저장된 값이 소문자라면 대문자로 변환
            } else if(Character.isLowerCase(ch)) {
                chArray[i] = Character.toUpperCase(ch);
            }        
        }
        // char 배열을 문자열로 변환
        a = new String(chArray);
        System.out.print(a);
    }
}