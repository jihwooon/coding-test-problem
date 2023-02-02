package interview.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeNumber {
    public boolean isPalindromeNumber() {


        return true;
    }


    @Test
    void result() {
        String s = String.valueOf(12);

        assertThat(s).isEqualTo("12");
    }
}
