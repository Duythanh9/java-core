package Giao_lang.Session06_Inheritance.ParentChild.parentchild;

public class Child extends Parent {

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }

    @Override
    public void showProfile() {
        System.out.println("Child: asset1: " + assetOne + "; assetTwo:  " + assetTwo);
    }

    public void sayHello() {
        System.out.println("Hey, I am a rich kid!!!");
    }

    // Biến dị hoàn toàn mà bên Cha không có
    // đừng hỏi tui nếu Cha có thêm hàm, bớt hàm, Con bị ảnh hưởng liền

}
