package Giao_lang.Session06_Inheritance.ParentChildV2.parentchild;

public class ParentChild {
    public static void main(String[] args) {
        playWithPointer();
    }

    public static void playWithPointer() {
        Parent parent = new Parent("Nha", "1000 BTC");
        parent.showProfile();
        // parent. xổ tất của cha


        Child child = new Child("Can ho", "100 BTC", "New Car");
        child.showProfile();
        // child. xổ tất của Con (Cha cho + @ + thêm khác nữa)


        Parent c2 = new Child("Nha Pho", "100 ETH", "New Motor");
        c2.showProfile(); // Gọi Cha nhưng chạy Con - @OVerride, để Con lái xe
        
    }
}
