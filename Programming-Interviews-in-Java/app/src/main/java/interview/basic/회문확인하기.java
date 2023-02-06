package interview.basic;

/**
 * ## 미지의 것
 * 주어진 10진수 숫자가 회문인지 아닌지 확인하는 프로그램을 작성하라.
 * ## 자료
 * 회문 : 앞으로 읽어도, 뒤로 읽어도 동일한 문자열
 *  >> redivider = rediv + vider
 * 10진수 : 일반적으로 사용하는 숫자
 * ## 조건
 * 음수이면 회문이 될 수 없다.
 * ## 계획
 * 1. 주어진 입력 x의 자릿수 n은 x에 밑이 10인 로그을 구한다.
 * 2. 최하위 숫자는 x mod 10 과 최상위 숫자는 x/10^n-1
 * 3. 최하위 숫자와 최상위 숫자를 반복적으로 비교한 뒤 그들을 입력에서 제거해간다.
 * 4. 151751 최하위 숫자와 최상위 숫자 1로 같으므로 제거한다.
 * 5.
 * ## 반성
 *  문제 접근방법이 어렵다. 이 문제를 이미 정형화 되어 있는 문제라서 이해하고 외워야 한다.
 *
 */
public class 회문확인하기 {
    public static Boolean solution(int x) {
        if (x < 0) {
            return false;
        }

        final int log = (int) Math.floor(Math.log10(x)) + 1; // 최하위 숫자
        System.out.println("log = " + log);
        int msdMask = (int) Math.pow(10, log - 1); // 최상위 숫자
        System.out.println("msdMask = " + msdMask);
        for (int i = 0; i < (log / 2); i++) {
            if (x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }

        return true;
    }
}
