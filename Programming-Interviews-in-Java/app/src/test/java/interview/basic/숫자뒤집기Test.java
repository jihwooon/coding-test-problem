package interview.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class 숫자뒤집기Test {

    @Test
    void result() {
        assertThat(숫자뒤집기.solution(42)).isEqualTo(24);
    }
}

