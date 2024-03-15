package 기초트레이닝;

//문자열 곱하기
class Solution12 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
			answer += my_string;
		}
        
        return answer;
    }
}