package interview.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class 회문확인하기Test {

    @Test
    void success() {
        assertThat(회문확인하기.solution(0)).isTrue(); // 회문
        assertThat(회문확인하기.solution(7)).isTrue(); // 회문
        assertThat(회문확인하기.solution(11)).isTrue(); // 회문
        assertThat(회문확인하기.solution(2147447412)).isTrue(); // 회문
    }

    @Test
    void fail() {
        assertThat(회문확인하기.solution(-1)).isFalse(); // 회문이 아님
        assertThat(회문확인하기.solution(12)).isFalse(); // 회문이 아님
        assertThat(회문확인하기.solution(100)).isFalse(); // 회문이 아님
    }

}
