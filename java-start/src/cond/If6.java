package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        //할인을 한번만 해주기 위해서 if ,else-if문 전체로
        if(price>=10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }else{
            System.out.println("할인 없어용");
        }

        //결과
        System.out.println("총 할인 금액: "+discount +"원");
        if(false) //중괄호 생략 가능, 실행할 동작이 1개일 때..!
            System.out.println("if문에서 실행됨");
        System.out.println("if문 밖에서 실행된 것");


    }
}
