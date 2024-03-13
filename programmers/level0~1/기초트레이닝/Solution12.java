package 기초트레이닝;

import java.util.Arrays;
import java.util.Scanner;

//문자열 곱하기
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
			answer += my_string;
		}
        
        return answer;
    }
}