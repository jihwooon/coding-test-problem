package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * ## 미지의 것
 * 회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return
 * <p>
 * ## 자료
 * - 원하는 제품
 * - 원하는 제품 수량
 * - 마트에서 할인하는 제품
 * <p>
 * ## 조건
 * -
 * <p>
 * ## 계획
 * -
 * <p>
 * ## 반성
 */
public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> matchMap = new HashMap<>(); // 해쉬맵
        for (int i = 0; i < want.length; i++) {
            matchMap.put(want[i], i);
        }

        int total = 0; //
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        int part1 = 0;
        int part2 = total - 1;

        int[] saleNumber = new int[number.length];
        for (int i = 0; i < total; i++) {
            if (matchMap.containsKey(discount[i])) {
                saleNumber[matchMap.get(discount[i])]++;
            }
        }
        while (true) {
            if (checkMatch(number, saleNumber))
                answer++;

            if (matchMap.containsKey(discount[part1])) {
                saleNumber[matchMap.get(discount[part1])]--;
            }

            part1++;
            part2++;

            if (part2 == discount.length)
                break;

            if (matchMap.containsKey(discount[part2])) {
                saleNumber[matchMap.get(discount[part2])]++;
            }
        }
        return answer;
    }

    Boolean checkMatch(int[] number, int[] saleNum) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] > saleNum[i])
                return false;
        }
        return true;
    }

    @Test
    void result() {
        assertThat(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})).isEqualTo(3);
        assertThat(solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"})).isEqualTo(0);
    }
}
