* Ôn lại ANNONYMOUS CLASS - Tạo Object mà ko chỉ định rõ Class có sẵn
                          - Mượn NEW Class Cha Abstract để có đc vùng 
                            SUPER + EXTENDS/OVERRIDE

                          - Vùng ram Object Con giống y chang như vùng
                            ram của mọi Object con khác tạo từ Class có sẵn
                          - Vùng Ram bự này về lí thuyết xuất phát từ khuôn con nào đó mà ta o thèm
                            làm khuôn vùng ram bự này gọi là thuộc về Class vô danh
 
                                                
- Truyền thống ta tạo Object Con là ta phải có Class Con trước (Recatangle, Square, Disk) vs các hàm @Verride viết sẵn, viết 1 lần,
  xài cho mọi lần New.
 Ta sẽ làm Class Con nếu ta biết chắc chắn sẽ dùng để nhân bản đc nhiều Object Con trong tương lai, nó đầy đủ code theo kiểu công thức xử lí

 - Cách On The Go, ko cần class Con có sẵn, ta lợi dụng class Cha new luôn. New luôn mới chỉ có đc super Cha, chưa có được phần code cho Cha tự bung ra thêm 1 phần {... ta viết nốt code cho hàm @Override} Đừng quên chấm phẩy vì nó tương new Class Con();
 
 Cha objectLẻ = new Cha(...) { // Ăn đòn liền, vì cha ko hoàn hảo
                               // chứa abstract, lát hồi objectLe. hàm abs
                               // ko có code để chạy
                               // chấm cha, nhưng con qua mặt
                               // cần có code của con, @Override
                        // Lỡ new Cha cần viết luôn Code On The Go
    @Override
    Các hàm Cha cần có code
 };

 Shape r1 = new Ractangle(...); // có sẵn super() + @Override làm sẵn rồi

 Shape xxx = new Shape(...) { // Ba sẽ là cánh chim

            @Override  // đưa con extends thật xa, qua mặt
            Các hàm cần code cho Cha here();
 };

 new Con = new Cha + phần mở rộng;          kết thúc ~~
 new HCN = super Cha + phần mở rộng làm sẵn rồi

 * Giá phải trả: Ăn theo, New theo Constructor của Cha, mình ko tạo Class rời kiểu HCN, HV để có phễu riêng
    tự viết lại code cho các hàm @Override do mình ko làm khuôn có sẵn

 Lợi điểm là bất cứ lúc nào cần New Objet là làm đc liền, vì On The Go, Mượn Cha New ~~~~ Super

 * Dùng khi cần Object trong 1 tình huống nào đó mà ko mất công phải tạo ra class rời ... học sau này

 * Đích đến à Object, vùng new, có code để chấm chạy
 * Khuôn/Class giúp mình tạo Object nhanh!!!
 * Lập trình OOP: Tạo vùng ram chứa Code/Hàm xử lí để gọi mà xài
   Lập trình nói chung: viết hàm xử lí Data

====================================================================================
Tổng kết chung cho kế thừa - Thừa hưởng đặc điểm vs hành vi
                           - Có họ hàng, bà con, vì chung đặc điểm
                           - Liên quan đến cây phân loại, phân loại OBject trog cuộc sống của con người

                           Loài, Chi, Họ, Lớp, Ngành ....
                           Vehicle, Pet, Animal, Văn phòng phẩm,....
Is A Kind Of, Đọc 1 chiều
Con là 1 phiên bản của Cha - HV là 1 HCN, Mèo là một thú-cưng 
Con thừa hưởng các đặc điểm và đặc điểm của Cha

- Cha cụ thể - COn cụ thể (đủ code cho cả 2)
                    Con có thể @Override dị biệt, ko ép
                    Con có thể có dị biệt nếu muốn, ko ép
                    Thực ra đã có đủ từ Cha hoàn hảo rồi
  Khai Cha new Cha
  Khai Cha new Con
  Khai Con new Con

  * Cha trừu tượng - COn hoặc trừu tượng (Vô sinh, ko new đc object)
                     Con hoặc phải Code cho Cha
                          Con bắt buộc phải @Override cho Cha
                          Con có thể có dị biệt nếu muốn
                          Phải hoàn tất giấc mơ của Cha!!!!
                          Vì Cha chỉ nói thôi, chưa làm, chưa hoàn hảo
  Khai Cha new Cha {...@OVerride};  // anonymous do làm biếng tạo Con sẵn
                  // Tạo Object con rồi, new Cha mà phải  thêm code thì ko là Cha

  Khai Cha new Con, đa hình  xảy ra, COn qua mặt hàm @ Cha
  Khai Con new Con      

  ===========================================================
  Cuộc đua kì thú again...
  Hamster
  Dog             ---------------|> Pet (Nhân tử chung của đám Con)
  Cat                                   (đặc điểm & hành vi)
  Sóc                         

2 anh bạn chạy xe Exciter rượt theo con Dog
  trên đường đua lúc này có Pet và Motor cùng đua, cùng lane đường, đua cùng nhau, so kè tốc độ,
  cùng mảng trên phố!!!
  - Mô phỏng lại trong lập trình thì: Pet và Motor phải cùng mảng!!! mảng nào???
  Cùng mảng thì phải cùng kiểu data type
  Pet is kind of MOtor -> gẫy
  Motor is kind of Pet -> gẫy, Motor là xé cưng, ko là thú cưng

  Chỉ vì cùng rượt đuổi nhau, nên mới chung đường
  Cả 2 có cùng 1 mục đích, hành động, một thằng chạy ép xung để thoát
                                          thằng kia rượt hết tay ga để bắt đc thằng kia
  Ta ko care chuyện gì khác, ngoài 2 đứa đua vs nhau
  Ta Focus vào hành động chạy, hành động đua, hành động rượt nhau, ko care chuyện gì khác 
  Ta đang chung mục đích, hành động, rõ ràng ta đang là hội-đua-thủ

  Hội đua thủ là hội/gom nhóm những gã chỉ tập chung vào việc duy nhất, đua!!! 

  Ta chỉ tập chung vào hành động, ta đã chơi chung với nhau, ko care xuất thân, ngoài đời là có thật
    Đây là cách ta lập hội nhóm ở ngoài đời

    Hội nhóm là gom những thành viên có chung sở thích, chí hướng hành động, ko care nguồn gốc xuất thân 
    Ví Dụ: CLB-ĐI-Phượt, Phượt-Thủ gom những bạn từ khắp nơi, chỉ thích, quan tâm:
          Cuộc đời là những chuyến hành xác
          Chấp bạn là Student, Worker, Lecturer, Freelancer, Employee, miễn bạn sẵn sàng lên đường
          Bạn là Member of Hội-Phượt-Thủ
          Gom nhóm về hội nào đó - 1 class phượt - thủ xã hội

  VD: Bạn là Worker, Student, Lecturer, Pupil, bạn cần cải thiện tiếng anh, bạn tham gia tiếng anh vào CLB-Tiếng-Anh
  cùng giao tiếp tiếng anh Worker, Student, Lecturer, Pupil, Employee Is A Member of Englist-Club method duy nhất: speakEnglish()

  VD: Worker, Student, Lecturer, Pupil, Employee ...
  ra phố bùi viện và bạn thuê 1 cái bình Shisha, đổ thuốc lào Ả-Rập, cả đám cùng kéo cần hút ShiSha
  Worker, Student, Lecturer, Pupil, Employee Is A Member Of ShiShaer
  Chúng mình là đám/Gã nghiện ngập Shisha,      tham gia hội, phải hút theo cách nào đó

  Mỗi hội tập chung vào hành động mà hội viên cần phải theo!!! chấp hội viên đến từ đâu
  VD: Worker, Student, Lecturer, Pupil, Employee,... tiếp tục phê ShiSha rồi, hưng phấn tay lái, rủ nhau đi tốc độ, lên con exciter, Winner, RGV, Rebel, CBS.... kéo tay ga... tăng tốc, chỉ tập chung vào tốc độ
  Worker, Student, Lecturer, Pupil, Employee,... Is A Member Of
                                                Is A           Death-racer
  Clb đua đến chết xuất hiện với hành động đua gác tay ga, gác kim đồng hồ

  Chung hành động, chung tiếng nói, ở chung với nhau phần này thôi, chung mảng chung kiểu member, chung clb, gom nhóm theo hành độngm, gom theo Interface, tiếng nói chung tham gia clb, ta chỉ quan tâm hành động -


  Khuôn này dính dáng khuôn kia 1 xíu về hành động
  Để chúng có thể chung nhau 1 chút gì đó trên hành động
  Tụ tập đc 1 nhóm cùng hành động, có nhóm thì có tên, có Class - Class là cách gom nhóm

2. Hình thức gom nhóm

  - GOM trên đặc điểm và hành vi - Inheritance (Họ hàng bà con)
  Inheritance/Abstract Class: tên của 1 dòng họ nhiều con cháu chia sẻ đặc điểm hành vi

  - Gom trên hành vi, tụ tập nhau làm gì đó - Inheritance - chung giao tiếp (Hội nhóm)
  Interface: Tên của 1 hội nhóm ăn chơi hành động

  Is - A - Kind - Of chặt chẽ trong phân loại (Đặc điểm và hành vi)

  Is - A - Member Of (G.L chế ra) hội nào đó (hành vi mục đích) lỏng lẻo việc kết hợp 

  tui, bạn bên YTB của tui, ngồi chung với nhau vì yêu thích code, ko Care chuyện gì khác, chúng ta thuộc clb yêu code đến chết, ngồi chung buổi live, code thoi()

========================================================================
Chốt hạ về OOP
- OOP Concepts/ OOP Principles/ Fundamental Concepts of oop/ Four Pillars of OPP
1. ABSTRACTION - trừu tượng hóa mọi vật (Đừng nhầm lẫn với abstract class)
- Là cách tư duy, cách suy nghĩ, chuyển đổi, biểu diễn những thứ phức tạp trong cuộc sống thành những thứ đơn giản hơn nhưng vẫn diễn tả đúng ý nghĩa của sự vật ban đầu
- Là cách nói về những thứ phức tạp trong cuộc sống thông qua 1 thứ khác đơn giản hơn, vẫn ko làm mất đi ý nghĩa của thứ phức tạp ban đầu
- Biểu diễn lại 1 thứ phức tạp ngoài đời để dễ hiểu hơn
- Cách lấy ra những thông tin quan trọng nhất, tiêu biểu nhất của 1 object phức tạp ngoài đời để biểu diễn lại cho ai cũng hiểu đc thứ phức tạp
- Một thứ phức tạp ngoài đời đc biểu diễn qua 1 thứ đơn giản hơn, vẫn ko làm mất chất
- Using a simple things to Represent the Complex things
- Extract the significant Features/Characteristics of a complex things to form a simple/Easy Catching things without losing the Orginal Meaning of the complex ones

- Tư duy nắm bắt thông tin cốt lõi quan trọng của object ngoài đời, dùng để biểu diễn lại object đó
- Ví dụ: Sinh viên ở ngoài đời rất phức tạp về info: tên, tuổi, địa chỉ tt, tạm trú, chích vaccine, lịch trình di chuyển, gia cảnh, ba mẹ, sở thích, chuyên ngành học, học kì đang học, tình trạng học/deadline, điểm thi các môn, mối quan hệ xã hội, ... n thông tin của 1 object, quá complex 
- Trường đại học ko cần nắm hết info này, vẫn có thể quản lí đc "thứ/object" phức tạp này
- Tìm ra những info đặc trưng đủ để quản lí, biểu diễn/ minh họa/ mô tả (represent) một sv
- Sinh viên (id, email trường, tên, địa chỉ tt, phone, chuyên ngành, điểm các môn) rút gọn/extract chỉ lấy những info quan trọng nhất, có ý nghĩa nhất ra để minh họa để biểu diễn 1 sv bất kì,rút gọn từ N info ở trên còn vài info
ở trên còn vài info quan trọng, bạn vừa xong thao tác trừu tượng hóa 1 bạn SV, biến từ phức tạp thành đơn giản vẫn giữ nguyên ý nghĩa

-> Tìm đặc điểm quan trọng của 1 object, tìm đặc điểm cho 1 class/khuôn -> Abstraction biến đổi biểu diễn info ko khiến mất gốc ban đầu, mô tả lại 1 câu chuyện /thứ nào đó, để ai cũng hiểu được, tính trừu tượng/ tính mô tả/ ngắn gọn trừu tượng hóa tức là kể lại 1 câu chuyện mô tả trong trí não/hình dung trong đầu kể lại cho ai đó nghe và người ta hiểu được

- bệnh nhân cũng vậy, mã bn, tên, dị ứng, lịch sử khám, đơn thuốc

2. ENCAPSULATION - (Hệ quả của trừu tượng hóa) Cô lập đóng gói mọi thứ
- Nhận diện 1 đối tượng gồm đặc tính và hành vi, gom chung trong 1 đơn vị object/class
- Hàm (xử lí data) + biến (data) gom vào 1 đơn vị code/class/object
- Gom xong giấu/ che đi bằng thuật ngữ private, show ra nếu muốn theo cách public/protected
- Tạo Class đóng gói mọi thứ đặc điểm + hành vi, che và ko che
- Giống y chang viên thuốc tây con nhộng - vỏ ngoài là protein-kiểu nhựa-sinh-học, tan khi uống vào, vặn vặn tách viên thuốc bên trong thấy bột thuốc.
- Nhìn bên ngoài vỏ thuốc con nhộng, ko thấy thuốc bên trong, ENCAPSULATION (v) gói lại che giấu, có thể trong suất nếu muốn... Nhưng trong con nhộng, kén, vỏ nhựa sinh học chắc chắc chỉ có thuốc
- Gom info và xử lí vào trong 1 đơn vị, che giấu show ra khi cần thiết
- TIVI: Che bằng cái vỏ nhựa đen/xanh/bạc/màn hình, ta chỉ tương tác qua remote/nút bấm ko thấy bên trong tivi ra sao, xử lí info + quét data bộ phim wifi/ vô tuyến, éo quan tâm đứng ngoài tivi giao tiếp qua public nút bấm. tivi chính là encapsulate
- ATM cũng vậy, ko thấy khay tiền private, ko thấy cục hít tiền, ko thấy hành xử bên trong chỉ public cái hành động bấm nút rút tiền... đóng gói, gói cho việc rút tiền, ko làm việc khác

Tivi duyệt Web, xem phim. chấm hết
Xe máy che hết đây, ống, khung, xấu xí qua vỏ, bửng xe, dần mủ. public ra cái nút bấm, tay gas xài. Xe máy éo quan tâm wifi, tiền,...

Encapsulation chính là cách gom biến/data và hàm vào 1 đơn vị đối tượng/vật thể/object/class chỉ làm đúng việc của nó đc chỉ định thiết kế
Gom gì thì cần Abstraction để lấy cái cái đặc trưng Tivi xem phim, ko gánh thêm việc lò nướng

Abstraction là lấy ra đặc trưng, ENCAPSULATION là gói trọn vẹn đúng thứ cần làm
nhận diện object                  tạo class instance variable + method()

3. INHERITANCE - Tái sử dụng/ có xài luôn, ko cần thao tác gì thêm, ko pải copy&Paste
- Resuse lại code ko cần phải làm lại code, thậm chí ko cần phải copy & paste
- Con thừa kế di sản tài sản di chuyển sự thông minh và giỏi giang từ ba má!!!
- Tăng tốc quá trình viết code khi có đoạn code, object đã làm tốt việc của nó rồi ta tận dụng để mở rộng thêm khả năng của object mới, dùng lại đồ object cũ + dị biệt ta làm thêm
Tăng tốc làm: Ba má giàu có, có tiền, mình thuận lợi có vốn làm ăn
              Ba má cho căn nhà, mình đỡ lo cho tiền trọ, ta chỉ lo tiền ăn
              Ba má cho vốn, ta làm giàu nhanh hơn, ko áp lực trả nợ, lời giữ luôn
              Thay vì bòn rút kiểu bất hiếu, xài mà ko chịu làm thêm
                              Nay ta bật nhanh hơn, hội nhập, join cuộc sống nhanh tự tin hơn
Có thư viện viết code làm app cho nhanh, ko làm lại từ đầu
Có thư viện, mở rộng thư viện cho nhu cầu riêng, đa năng sử dụng, tắc tốc viết code
Cha cụ thể, Cha trừu tượng, cây phân loại giảng hôm bữa rồi, bài 24
ABSTRACT class chẳng qua là cách gom, phân loại đối tượng mức cao thấp
                                      giống như phân loại sự vật ngoài đời, gom nhóm ngoài đời
Tận dụng kế thừa  thành quả object có cái gì??? dùng lại nguyên tắc trừu tượng hóa + ENCAPSULATION

4. POLYMORPHISM - Đa hình/ ánh xạ - Một ra nhiều
- Mùa đông năm 1946, Bác hồ kêu gọi toàn quốc kháng chiến, ai có súng dùng súng, ai có dao dùng dao ....
Chỉ là 1 câu kêu gọi: CHiến()
Nhân dân quật khởi đứng lên: dao, kiếm, liềm, móc câu, hầm chông, súng, đốt,...
                              đa dạng cách giết giặc, đa dạng cách IMPLEMENTS hành động chiến()
từ 1 chữ chiến() có N cách làm khác nhau, tính đa dạng, biến hình, đa sắc thái, đa nhân cách  đa hình, Polymorphism
Đại ca kêu tối nay giang hồ chợ lớn, đi chiến nha()                              
                                                   đàn em đem hàng: mã tấu, dao, nóng, côn nhị khúc,
Các vua Hùng đã có công dựng nước, Bác Cháu ta phải Implements/Override
Từ 1 hàm Cha, n Con @Override qua mặt, chính là tính đa hình
Gọi Cha mà Con chạy
Đảm bảo tính đa dạng của các hành động vẫn chs chung và thống nhất hành động qua tên gọi 
@Override hiện thực cho tính đa hình                                                   