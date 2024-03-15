package 기초트레이닝;

//문자열 곱하기 비교
class Solution14 {
	public int solution(int a, int b) {
		String ab = String.valueOf(a) + String.valueOf(b);
		int ab_int = Integer.valueOf(ab);
		
		int ab_2 = a * b * 2;
		
		return Math.max(ab_int, ab_2);
		
	}

	public static void main(String[] args) {
		Solution14 solution = new Solution14();

		// 테스트 입력
		int a = 91;
		int b = 2;

		// solution 메서드 호출
		int result = solution.solution(a, b);

		// 결과 출력
		System.out.println("결과: " + result);
	}
}