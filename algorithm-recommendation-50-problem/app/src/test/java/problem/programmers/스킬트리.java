package problem.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 스킬트리 {
    public int solution(String skill, String... skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            String tempSkill = skillTree;

            for (int i = 0; i < skillTree.length(); i++) {
                String substring = skillTree.substring(i, i + 1);
                if (!skill.contains(substring)) {
                    tempSkill = tempSkill.replace(substring, "");
                }
            }

            if (skill.indexOf(tempSkill) == 0) {
                answer++;
            }
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution("CBD", "BACDE", "CBADF", "AECB", "BDA")).isEqualTo(2);
    }
}
