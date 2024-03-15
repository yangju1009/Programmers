package 기초트레이닝;

// 공배수
// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
class Solution16 {
	public int solution(int number, int n, int m) {
		return (number % n == 0 && number % m == 0) ? 1 : 0; 
	}

	public static void main(String[] args) {
		Solution16 solution = new Solution16();

		// 테스트 입력
		int number = 10;
		int n = 2;
		int m = 3;

		// solution 메서드 호출
		int result = solution.solution(number, n , m);

		// 결과 출력
		System.out.println("결과: " + result);
	}
}