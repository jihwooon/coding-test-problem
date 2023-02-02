package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ## 미지의 것
 * 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하라.
 * <p>
 * ## 자료
 * - push X: 정수 X를 스택에 넣는 연산이다.
 * - pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * - size: 스택에 들어있는 정수의 개수를 출력한다.
 * - empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * - top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * <p>
 * ## 조건
 * - 정수는 1보다 크거나 같고 100,000보다 작다.(1<=N<100,000)
 * - N은 정수를 저장하는 스택을 만든다.
 * <p>
 * ## 계획
 * - N만큼의 저장하는 스택 배열을 만든다.
 * <p>
 * - 출력 초기화 값을 만든다.
 * - 각 기능별 메서드를 만든다.
 * - switch case 사용해서 기능마다 동작 가능하게 만든다.
 *
 * ## 반성
 * - push, pop 기능을 만드는데 이해를 못 했다.
 * - switch 사용하는 것을 이번 계기로 알게 되었다.
 * - stack을 다시 한번 내 의도에 맞는 것을 구현해봐야겠다.
 * - stack과 달리 queue도 똑같이 구현 해봐야겠다.
 */

public class 스택 {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            switch (str) {

                case "size": {
                    System.out.println("size = " + size());
                    break;
                }
                case "empty": {
                    System.out.println("empty = " + empty());
                    break;
                }
                case "pop": {
                    System.out.println("pop = " + pop());
                    break;
                }

                case "push": {
                    push(Integer.parseInt(br.readLine()));
                    break;
                }

                case "top": {
                    System.out.println("top = " + top());
                    break;
                }
            }

        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }

        int res = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return res;
    }

    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int top() {

        if(size == 0) {
            return -1;
        }

        return stack[size - 1];
    }


}
