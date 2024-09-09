package Operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예시
        int a = 1;
        int b = 0;
        b = ++a; // 전위 증감자 a의 값을 증가시키고 b에 대입
        System.out.println("a = " + a + ",b = " + b);


        //후위 증감 연산자 사용 예
        a = 1; // a값을 다시 1로 지정
        b = 0; // b의 값도 다시 0으로 지정

        b = a++; // 일단 b = 1 그후 a++ = a + 1
        System.out.println("a = " + a + ",b = " + b);

    }
}
