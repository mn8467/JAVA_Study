package Operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8 , a = a + 3
        a -= 2; // a = a - 2;
        a *= 4; // a = a * 4; 24
        a /= 3; // a = a / 3;
        a %= 5; // 3 (8 % 5): a = a % 5
        System.out.println(a);
    }
}
