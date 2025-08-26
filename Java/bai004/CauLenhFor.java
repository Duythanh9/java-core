package Java.bai004;

public class CauLenhFor {
    public static void main(String[] args) {
        test1();
    }

    public static void test(){
        for(int i = 0; i < 10; i++){
            if(i == 6){
                break;// ngắt luôn ở vòng lặp này không chạy nữa
            }
            System.out.println(i);
        }
    }

    public static void test1(){
        for(int i = 0; i < 10; i++){
            if(i == 6){
                continue;// nếu i == 6 ở vòng lặp này thì câu lệnh bỏ qua luôn, rồi
                        // chạy đến vòng lặp tiếp cho đến hết.
            }
            System.out.println(i);
        }
    }

}
