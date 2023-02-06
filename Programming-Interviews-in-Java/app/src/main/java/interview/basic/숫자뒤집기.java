package interview.basic;

/**
 * ## 미지의 것
 * - 정수값이 주어졌을 때, 그 숫자를 뒤집어서 출력하는 프로그램을 작성하라
 *
 * ## 자료
 * - 정수값 (= 음수값이 아님)
 *
 * ## 조건
 * - 음수가 아닌 양수이여야 한다.
 *
 * ## 계획
 * - x를 입력한다.
 * - 입력 값에 % 10의 나머지 값을 구한다.
 * - 남은 값의 나누기 10은 나머지 값을 뺀 값과 동일하다.
 * - 남은 숫자를 반복해서 구한다.
 *
 * ## 반성
 * - 숫자 뒤집기의 문제 접근법을 잘 몰랐다. 42 숫자를 24로 변경한다. 이 접근방법이 떠오르지 않았다.
 * - 나누기 10을 왜 하나 했더니 나머지 뺀 값에 숫자가 /10 과 동일하는 것을 이해했다.
 *
 */
class 숫자뒤집기 {
    public static long solution(int x) {
        long result = 0;
        long xRemaining = Math.abs(x); // 절대값
        while (xRemaining != 0) {
            result = result * 10 + xRemaining % 10;
            System.out.println("result = " + result);
            xRemaining /= 10;
            System.out.println("xRemaining = " + xRemaining);

        }
        return x < 0 ? -result : result;
    }
}
