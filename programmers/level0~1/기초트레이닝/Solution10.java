package 기초트레이닝;

import java.util.Arrays;
import java.util.Scanner;

//섞어쓰기
class Solution {
	public String solution(String str1, String str2) {
		  String answer = "";

	        for(int i = 0; i < str1.length(); i++){
	            answer+= str1.charAt(i);
	            answer+= str2.charAt(i);
	        }

	        return answer;
	}
}
