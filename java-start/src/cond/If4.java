package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 8;
        if( age <= 7 ){ //조건 통과 false
            System.out.println("미취학");
        } else if (age <= 13) { // 이 조건에 해당됨 true
            System.out.println("초딩");

        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        }else {
            System.out.println("성인");
        }
    }
}
