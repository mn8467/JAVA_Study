package Operator;

public class Operator1 {
    public static void main(String[] args) {
        int a =5;
        int b =2;

        int sum = a+b;
        System.out.println("a + b = " + sum);

        int diff = a - b;

        int multi = a * b;
        System.out.println("a * b = "+ multi);

        int div = a/b; // int는 정수형이기 때문에 소수점 표현이 안되기 때문에 정수부분만 표시됨 (형변환?)
        System.out.println("a / b = "+ div );

        // 나머지
        int mod = a % b; // 5 /2 를하면 몫이 2 고 나머지가 1 <-- 이게 나옴
        System.out.println("a % b = " + mod);

        /*
        int z = 10/0; // 0으로 나눌수는 없다
         */
    }
}
