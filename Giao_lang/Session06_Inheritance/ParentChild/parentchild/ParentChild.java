package Giao_lang.Session06_Inheritance.ParentChild.parentchild;

public class ParentChild {
    public static void main(String[] args) {
        playWithPointer();
    }

    public static void playWithPointer() {
        Parent parent = new Parent("Nha", "1000 BTC");
        parent.showProfile();
        // parent. xổ tất của cha


        Child child = new Child("Can ho", "100 BTC");
        child.showProfile();
        // child. xổ tất của Con (Cha cho + @ + thêm khác nữa)

        child.sayHello();

        Parent c2 = new Child("Nha Pho", "100 ETH");
        c2.showProfile(); // Gọi Cha nhưng chạy Con - @OVerride, để Con lái xe
        //c2.sayHello(); // ko xổ ra của riêng COn dù đã new Con và có sẵn trong
        // mình đang cư xử như Ba, Cha, dùng danh nghĩa Cha
        // mày biết Ba tao là ai không, hù theo kiểu của Ba, tuân theo hành động của Ba
        // Khai báo kiểu Cha, chấm theo Cha
        // HV đang cư xử như CN
        // Con đang dùng danh nghĩa Cha, thì phải cư xử như Ba
        // Tổ lái con trỏ xuống đáy vùng new Con sẽ lấy được hàm sayHello()
        // Child x = cần trỏ vùng new Con
        Child x = (Child)c2; // mày hãy ráng xuống vùng new Child lấy cho tao
                            // tọa độ new Child, toa giữ lại trong x
        //          c2 trỏ vùng new Cha, super
        x.sayHello();
        // x cùng trỏ vùng new nhà phố

        // cách 2, nương theo cách 1, nhưng ko tốn 1 con trỏ Child
        // (Child)c2. // không xổ vì dấu chấm có độ ưu tiên cao, ăn theo data type
        ((Child)c2).sayHello(); // dấu ngoặc thay đổi đô ưu tiên, ép xong đi đã
        // rồi hãy chấm, kéo sợi thun xong chưa, xong rồi đó

        // miễn là lấy được tọa độ thì chấm
        // tọa độ gán vào biến chấm, quá tầm thường

    }
}
