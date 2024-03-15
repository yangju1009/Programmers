package 기초트레이닝;

import java.util.Scanner;

//덮어쓰기
class Solution9 {
	public String solution(String my_string, String overwrite_string, int s) {
 StringBuilder result = new StringBuilder();
         
         // s 이전까지는 그대로 가져옴
         result.append(my_string.substring(0, s));
         
         // overwrite_string을 추가함
         result.append(overwrite_string);
         
         // s + overwrite_string의 길이부터 my_string의 끝까지 추가함
         result.append(my_string.substring(s + overwrite_string.length()));
         
         return result.toString();
	}
}
