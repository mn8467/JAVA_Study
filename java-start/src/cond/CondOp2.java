package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ?"성인" : "미성년자"; //true면 성인, false면 미성년자를 리턴
        if(age >= 18){
            status ="성인";
        }else {
            status ="미성년자";
        }
        System.out.println("age = "+age + " status = "+status);
    }
}
