package 기초트레이닝;

//더 크게 합하기
class Solution13 {
	public int solution(int a, int b) {
		String ab = String.valueOf(a) + String.valueOf(b);
		String ba = String.valueOf(b) + String.valueOf(a);

		int abInt = Integer.parseInt(ab);
		int baInt = Integer.parseInt(ba);

		return Math.max(abInt, baInt);
	}

	public static void main(String[] args) {
		Solution13 solution = new Solution13();

		// 테스트 입력
		int a = 12;
		int b = 3;

		// solution 메서드 호출
		int result = solution.solution(a, b);

		// 결과 출력
		System.out.println("결과: " + result);
	}
}