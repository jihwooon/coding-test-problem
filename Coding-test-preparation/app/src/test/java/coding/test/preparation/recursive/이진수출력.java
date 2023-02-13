package coding.test.preparation.recursive;


// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하라
public class 이진수출력 {

    public void solution(int n) {
        if (n == 0) return;
        else {
            System.out.println("n = " + n % 2);
            solution(n / 2);
        }
    }

    public static void main(String[] args) {
        이진수출력 result = new 이진수출력();
        result.solution(11);
    }
}
