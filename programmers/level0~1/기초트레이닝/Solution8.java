package 기초트레이닝;

import java.util.Arrays;
import java.util.Scanner;

// 홀짝구분
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
			System.out.println(n + " is even");
		}else {
			System.out.println(n + " is odd");
		}
    }
}