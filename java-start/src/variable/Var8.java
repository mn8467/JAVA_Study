package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127 얘 안씀, 파일 전송 복사에 사용됨
        short s = 32767; //-32768 ~ 32767 얘도 실무에서 안씀
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long z = 2147483648L;
        //개큼 ㅈㄴ 범위 개큼 진짜 (높을수록 메모리공간 많이 차지함)
        long l = 9223372036854775807L;
        Long j = 323l;  // 대문자 L 소문자 l 둘다가능 , L도 붙여줘야함

        System.out.println(j);
        //실수
        float f = 10.0f; //f를 붙여줘야함 실무에선 float 사용 잘 안함 정밀도가 떨어짐, 얘도 실무에서 안씀
        double d = 10.0; // 훨씬 더 큰 숫자범위 사용가능, float 보다 정밀도가 더 높다

        char h = 'K'; // char 문자하나를 표현하는 일은 거의 없기 때문에 실무에서 잘 안씀

    }
}
