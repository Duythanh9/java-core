Lưu trữ chơi/ xử lí vời nhiều data/nhiều object
Thì ta cần mua cái túi, giỏ, Balo, Thùng, Tủ, Phòng để đựng nhiều đồ
Mua cái túi, mua cái túi, xây cái phòng, chính là new cái túi()
New cái tủ(), new căn-phòng()
Phả có một thùng chứa thật đc tạo ra để ta bỏ vô
Do đó phả NEw thùng-chứa là chắc chắn rồi

Quan điểm lập trình: New để có vùng Ram lưu trữ info + hàm xử lí info theo Encapsulation
Objet trong ram chính tương đương món đồ thật ngoài đời điện thoại trên tay bạn có màu sắc, giá tiền, hành động nghe, chụp ảnh, bạn phải mua về, nhà sản xuất phải tạo ra, new ra bạn mới có xài

Mình trừu tượng hóa món đồ thuật thành Object trong lập trình thì cũng cần new để có vùng ram có data + hành động

Mua tủ đựng nhiều đồ ta cần new tủ() có ko gian dựng đồ và các hành động tương ứng

Tủ tuCuaTui = new Tủ(); // trong ram sẽ có 1 vùng ko gian để đựng đồ
                        // ngoài đời Tủ chiếm 1 góc phòng để ta đựng đồ
Cái tủ mình cho làm gì mình làm đó/encapsulation/abstraction đấy
Mua tivi mà ko smart, chỉ xem cab thoy, làm sao duyệt, làm sao duyệt web đc
Mua tivi mà smart thì mới duyệt web đóng gói hành động đi kèm object. Mua dog về thì nó giỡn với mình

tuCuaTui.addDoVao(món đồ đưa vào trong tủ) // tủ cho phép mình bỏ đồ vô y chang lò nướng cho mình bỏ con gà vào, để nướng LoNuong loCuaTui = new LoNuong(); // mua lò về, chiếm góc bếp
loCuaTui.addDoNuong(co-gà để nướng)

Tủ là Object chứa nhiều đồ đạc khác
1. Mua tủ                   Tủ tuCuaTui = new Tủ();
2. Mua đồ ADD vô tủ         tuCuaTui.addMonDo(new/mua 1 món đồ thảy vô tủ)

Mua cái túi, mua cái giỏ, mua cái thùng, new Túi() New Giỏ(), có khóa dây kéo bỏ món đồ mình muốn cất
tuCuaTui.addMonDo(mua món đồ bỏ vào túi - new món đồ())
Có 2 loại Tủ
1. Tủ loại 1 : Fix cứng số đồ để vô, chỉ để bỏ vô 1 số giới hạn món đồ
 Chính là mảng [số đồ để vô]
 Mnagr là khai báo nhiều biến nhiều chỗ chứa [Fix số chỗ]
 Mảng y chang xe ô tô chỏ khách [16] chỗ
                    Rạp phim A/ Phòng chiếu A[100 ghế]
Chứa tọa độ vùng new món đồ
[i] = new món đồ() cứ thoải mái nằm đâu đó, ta lưu tọa độ

Student arr[] = new Student[100];
// sẽ có 100 chỗ ngồi cho sv à nhen, chưa có bạn nào cụ thể
// arr chính là biến má mì, tên gọi tắt cho 1 cái tủ có 100 chỗ

// tên mảng chính là tên gọi cho 1 cái tủ fix số chỗ!!!!
// vì nó trỏ đến new [số chỗ]

// Bỏ đồ vào mảng, ko cần dùng hàm, hành động của tủ, cho sờ trực tiếp chỗ để
arr[0] = món đồ bỏ vô, new món đồ bỏ vô;
 // ~~~~ tuCuaTui.addMonDo(new món đồ);
 // tuCuaTui vị trí 0 đc cất món đồ new món đồ

 // Món đồ new nằm trong HEAP, nằm bên ngoài tủ, tủ chỉ lưu ds tham chiếu
 // Tủ chứa ds bệnh nhân, bệnh nhân vẫn nằm trong phòng điều trị
 // gv giữ ds sv, sv ở quê đâu có sao                                        

Dù tủ loại 1 hay 2 thì đều chứa nhiều đồ: đồ để thật sự vào trong tủ
                hay chỉ giữ ds tham chiếu đều ok
            Tủ hồ sơ giữ ds tham chiếu, Google Meet giữ ds tham chiếu
            Danh sách kí tên(Tủ) chứa tham chiếu

            Tủ quần áo chứa đồ thật luôn  - Mảng Primitive value lấy xài luôn

2. Tủ loại 1 : Co giãn số đồ để vô, thoải mái để đồ vô, cần thêm chỗ, có thêm chỗ ko cần xin, cứ để đồ vô là thêm chỗ, giống nòi cơm thạch sanh, giống giếng khơi, múc nước lại có nước

New 3 loại tủ này, giống các thương hiệu túi xách balo bạn mua
ArrayList, Vector     |     HashSet, TreeSet         |          HashMap, TreeMap

addĐồ(món đồ khác đi mua) vào tủ ở ngăn thứ [i] nào đó nhìn theo kiểu mảng
Đều chứa tham chiếu. Linh hoạt trog việc để các món đồ
                    Bệnh nhân đâu cần dồn vào phòng bs, bs vẫn điều trị đc vì
                    có ds bệnh nhân trong tủ hồ sơ/Excel

Tủ thật túi thật mua về để xài, NEW đc, ko phải là ABSTRACT, hoàn hảo để dùng FUll code hành động
Con     ArrayList, Vector     |     HashSet, TreeSet         |          HashMap, 

Phân loại cao hơn cho tủ/ giỏ cụ thể
Cha                List                    Set                             Map
ABS?INTER       danh sách               Tập hợp                         bộ ánh xạ, từ này ra kia
                                                                    Key, món đồ - value
                vào thứ tự nào
                ra thứ tự nấy
                mảng nâng cao
                co giãn kích thước
                vào trước, ngồi[0]          HashSet lộn xộn thứ tự
                vào sau, ngồi [1]           TreeSet sắp xếp tự động !!
                                            ko đc lặp lại món đồ lần thứ 2



ngoài đời thống kê số vé bán                đếm số người thực sự xem phim
          số lượt người mua                 ko đếm lượt
          số lượt người ghé thăm            mỗi người xh 1 lần, ko hơn dù bạn
          một người có thể đếm nhiều lần           xem 2, 3 n lần     

Các tử List(ArrayList, Vector,...)
        Set (HashSet, TreeSet)              Đều chứa co giãn ngăn tủ, thích thêm thì thêm
        Map (HashMap, TreeMap)              Ko đáy, Doremon                 
                                            Chỉ lưu tham chiếu, lưu con trỏ, Add con trỏ
                                            Vào, vùng new món đồ thoải mái ở HEAP

                                            Mảng OBject y chang vậy luôn
                                            Chứa tham chiếu, lưu con trỏ Add lấy quá [i]
                                            Vùng new món đồ thoải mái trong HEAP
Y chang quản lí ds ngoài đời, tủ hồ sơ                                            
ban đồ ko có chỗ nào cả, ko đấy
cứ nhét đồ vô, tao thêm chỗ
ko sờ [i] vào vị trí chỗ
xin qua dây kéo, khóa, ngăn, cánh cửa, mở ra nhét đồ vô
tuCuaTui[i] = món đồ bỏ vô -> mảng
tuCuaTui.add(món đồ bỏ vô) bỏ vô qua hành động của tủ, ko sờ trực tiếp ngăn chứa [i]
bỏ vô tự tủ lo bên trong

Vẫn Code như xưa này: new tủ, . Gọi hành động của tủ đồ new riêng để vô
Mua tủ và mua đồ và cất đồ




* Ta có 2 cách