package 기초트레이닝;

//n의 배수
// 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
class Solution15 {
	public int solution(int num, int n) {
		int answer = 0;
		if (num % n != 0) {
			answer = 0;
		}else {
			answer = 1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution15 solution = new Solution15();

		// 테스트 입력
		int a = 98;
		int b = 2;

		// solution 메서드 호출
		int result = solution.solution(a, b);

		// 결과 출력
		System.out.println("결과: " + result);
	}
}