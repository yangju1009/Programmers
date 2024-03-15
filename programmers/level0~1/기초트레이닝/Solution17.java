package 기초트레이닝;

// 홀짝에 따라 다른 값 반환하기
/*양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.*/
class Solution17 {
	public long solution(int n) {
		long answer = 0;
		if (n % 2 == 1) {
			for (int i = 1; i <= n; i += 2) {
				answer += i; // 홀수인 경우에는 홀수를 더합니다.
			}
		} else {
			for (int i = 2; i <= n; i += 2) {
				answer += (long) i * i; // 짝수인 경우에는 짝수의 제곱을 더합니다.
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution17 solution = new Solution17();

		// 테스트 입력
		int n = 7;

		// solution 메서드 호출
		long result = solution.solution(n);

		// 결과 출력
		System.out.println("결과: " + result);
	}
}