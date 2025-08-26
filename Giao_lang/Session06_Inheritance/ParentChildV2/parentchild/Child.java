package Giao_lang.Session06_Inheritance.ParentChildV2.parentchild;

// 1. Phát hiện IS A, extends
// 2. Khai báo các đặc điểm của Con
// 2.1.Nếu con trùng với Cha về đặc điểm thì ta ko cần khai báo, ko cần làm, Cha làm
// 2.2. Con có quyền dị biệt đặc điểm so với Cha, dị biệt hành động luôn (ko bàn @Override)

// 3. Phễu con, giữ bản sắc Cha 
public class Child extends Parent {

    private String childAsset; // Con tạo dựng cơ ngơi riêng, sure Cha ko biết

    public Child(String assetOne, String assetTwo, String childAsset) {
        super(assetOne, assetTwo);// must be 1st statement in the Child's contructor
        this.childAsset = childAsset;
    }// Cha chưa tồn tại, lấy chỗ đâu cho con extends
    // Có Cha rồi mới có Con, Ba sẽ là cánh chim, đưa Con bay thật xa
    // new Cha mở rộng vùng nhớ Cha, mới có cỗ cho Con

    public String getChildAsset() {
        return childAsset;
    }

    public void setChildAsset(String childAsset) {
        this.childAsset = childAsset;
    }

    @Override
    public void showProfile() {
        System.out.println("Child: asset1: " + assetOne + "; assetTwo:  " + assetTwo);
        System.out.println("By the way, here is my own asset: " + childAsset);
    }

}
