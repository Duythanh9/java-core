package Giao_lang.Live.AmazingRaceV2.amazingracev2;

import Giao_lang.Live.AmazingRaceV2.data.Dog;
import Giao_lang.Live.AmazingRaceV2.data.Motor;
import Giao_lang.Live.AmazingRaceV2.data.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import Giao_lang.Live.AmazingRaceV2.data.DeathRacer;

public class AmazingRaceV2 {
    public static void main(String[] args) {
        runToDead();
    }

    // public static void playAnonymous() {
    //     // List list = new ArrayList<>();
    //     //abstract, interface đó, 20 hàm ko có code!!!
    //     List list = new List<E>() {

    //         @Override
    //         public int size() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'size'");
    //         }

    //         @Override
    //         public boolean isEmpty() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    //         }

    //         @Override
    //         public boolean contains(Object o) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'contains'");
    //         }

    //         @Override
    //         public Iterator<E> iterator() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    //         }

    //         @Override
    //         public Object[] toArray() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    //         }

    //         @Override
    //         public <T> T[] toArray(T[] a) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    //         }

    //         @Override
    //         public boolean add(E e) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'add'");
    //         }

    //         @Override
    //         public boolean remove(Object o) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'remove'");
    //         }

    //         @Override
    //         public boolean containsAll(Collection<?> c) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    //         }

    //         @Override
    //         public boolean addAll(Collection<? extends E> c) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    //         }

    //         @Override
    //         public boolean addAll(int index, Collection<? extends E> c) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    //         }

    //         @Override
    //         public boolean removeAll(Collection<?> c) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    //         }

    //         @Override
    //         public boolean retainAll(Collection<?> c) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    //         }

    //         @Override
    //         public void clear() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'clear'");
    //         }

    //         @Override
    //         public E get(int index) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'get'");
    //         }

    //         @Override
    //         public E set(int index, E element) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'set'");
    //         }

    //         @Override
    //         public void add(int index, E element) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'add'");
    //         }

    //         @Override
    //         public E remove(int index) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'remove'");
    //         }

    //         @Override
    //         public int indexOf(Object o) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    //         }

    //         @Override
    //         public int lastIndexOf(Object o) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    //         }

    //         @Override
    //         public ListIterator<E> listIterator() {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    //         }

    //         @Override
    //         public ListIterator<E> listIterator(int index) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    //         }

    //         @Override
    //         public List<E> subList(int fromIndex, int toIndex) {
    //             // TODO Auto-generated method stub
    //             throw new UnsupportedOperationException("Unimplemented method 'subList'");
    //         }
            
    //     };
    // }

  
    public static void runToDead() {
        // Có quyền có ai đó chạy ngang nhảy vô
        // Mĩ nhân ngư của Châu Tinh Trì nhảy vào
        // Người cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá, dụ thủy thủ đến
        // bắt ăn thịt
        // nếu ta làm class Mermaid rời - concrete, phải chuột tạo mới Class Mermaid
        // Viết code bình thường, code này có hàm batThuyThuVaAnThit()
        // Bắt Mermaid implement DeathRacer, bắt người cá đi đua chuyện quá đáng
        // Ko phù hợp logic, người cá ko thích đi chuyển đi đua!!!

        // Nhưng có 1 nàng người cá thích ăn chay, lên bờ chs vs con người
        // ko theo logic chung người cá là ăn thịt người thủy thủ
        // Object lẻ ko nhập chung đoàn Mermaid truyền thống
        // Không bắt Mermaid implements DeathRacer
        // Mĩ nhân ngư của Châu Tinh Trì phá đoàn, tham gia đua dưới kênh Nhiêu Lộc cho
        // vui
        // Ko bắt cả họ Người Cá đi đua
        // object đánh lẻ, đánh lẻ đua, thì chỉ cần đua tốc độ là đc rồi
        // Anonymous Class, ko thèm tạo class rời, mà vẫn tham gia CLB
        // Chỉ cần có hành động của CLB là okie rồi, ghe ngang thoy thì cũng phải hành
        // động .implements all abstract
        // methods on the go, take-away

        // Làm class riêng để nhân bản đc nhiều Member
        // Làm on the go dành cho vãng lai ghe ngang
        // Cả 2 đều phải Implements, @Override vì Cha, CLB ko hoàn hảo

        // Object on the go, cần có hàm đua và gáy thành tích là xong, éo làm CLB
        // éo làm class có sẵn để nhân bản
        // DeathRacer miNhanNguCTT = new Mermaid(); // class rời này sẽ có @OVerride
        // 2 hàm runToDead() showHowTo()
        // y chang Motor à
        // Mượn gió bẻ măng, éo khuôn sẵn thì phải code @Override từ đầu,
        // Cho mỗi lần chơi trò làm biếng tạo Khuôn
        // On the go @Override
        DeathRacer miNhanNguCTT = new DeathRacer() {
            // Đây là ko gian của Class Mermaid mà ta làm biếng làm riêng
            // Vùng này chính là phần mở rộng của Cha/CLB
            // Ba sẽ là cánh chim (new/super() new DeathRacer)
            // Đưa Con extends/implements thật xa thật nhiều @Override
            // Ta có quyền làm như truyền thống, thêm đặc điểm...
            // đừng lạm dụng, on-th-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50;
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }

            // Anonymous làm biếng tạo class rời cho cả Abstract class và interface
            // Bên Abstract class thì ta còn có đặc điểm của Cha cho để xài
            // Anonymous của Interface, đua thì đua đi, hỏi han làm chi, ko có infor
            @Override
            public void showHowToDead() {
                System.out.printf("|%-15s|%-10s|%-9.2f|\n", "MERMAID-RACER","MNN CTT", runToDead());
            }
        };// Vip

        Dog d1 = new Dog("Ngao Da", 2021, 50.0);
        // Chấm full hàm của Con, đủ code hàm Cha, CLB
        Pet d2 = new Dog("Vang oi", 1950, 10.0);
        // Chấm full hàm Cha, Khai Cha, chạy ko sợ vì đa hình Con qua mặt
        // Tổ lái con trỏ đc, new DOg mà sợ gì
        // Tao là "danh nghĩa Cha" thì chỉ xổ Cha hoy, học rồi
        // mày biết Bố tao là ai ko???, hù theo kiểu bố

        // C1 Dritf con trỏ
        // Dog x = (Dog) d2;
        DeathRacer d3 = new Dog("Nanh trang", 1901, 20.0);
        // Ngộ nhỡ dấu chấm thì sao??
        // Chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là đua thủ chỉ quan tâm đua thôi
        // chạy éo sợ vì Con Qua mặt, có đủ hàm Override đã làm rồi, đa hình tiếp
        // ép con trỏ đc luôn, new Dog mà sợ gì

        Motor m1 = new Motor("Exciter", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("Winner", "150.0cm3", "56F6-6789");

        // MNN em vẫn à 1 Racer, có hành động đua gấp 3 lần giới hạn
        // vật lí người cá, em xứng đáng gia nhập CLB đua, vào lane đua
        DeathRacer racer[] = new DeathRacer[] { d1, (Dog) d2, d3, m1, m2, miNhanNguCTT };
        // racer[0] = new Dog(...);
        // racer[1] = new Motor(...);
        // toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        // Con tự lo, COn Motor chạy theo Motor, Con Dog chạy theo Dog

        for (DeathRacer x : racer) {
            x.showHowToDead();

        }
    }
}
