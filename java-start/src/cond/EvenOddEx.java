package cond;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 100;
        String result = (x%2 == 0) ? "짝수" : "홀수";
        System.out.println("출력: x = "+x +", "+result);

    }
}
