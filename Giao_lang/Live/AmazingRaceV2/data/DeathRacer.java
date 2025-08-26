package Giao_lang.Live.AmazingRaceV2.data;

// CLB của gã thích đua đến chết, gom những Class, Object mà có chung hành động
// đua, ko care chuyện gì khác
// CLB là nơi tập hợp những người chung tiếng nói, hành động, giao tiếp/ INTERFACE
// Lỏng lẻo hơn kế thừa, ko care đặc điểm, di truyền đặc điểm, chung hành động vào chơi chung
// Motor, Dog, ... Is A Member Of, Is A DEADRACER
// Anh em mình là Student, Sinh ra là SV
// Anh em mình còn là cần thủ, cờ thủ, cầu thủ, sát thủ, ... game thủ
// Anh em mình nhìn theo dòng họ: Cháu ở nhà ngoan lắm
// 1 Object, khuôn hội nhập theo 2 cách: Dòng họ bà con, hội nhóm xã hội
// Hội bà con: di truyền và kế thừa
// Hội xã hội: cùng nhau chiến, làm gì!!!

// Chỉ quan tâm hành độg, trong đây chỉ chứa hành động
// CLB để anh em tự mình hành động theo cách của mình
// vào CLB tiếng anh mình SpeakEnglish theo giọng của mình!!!
// đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe
// cà chân chống tóe lửa...
// INTERFACE CLB để mọi người tự chơi theo cách của mình - chơi - hành động là abstract
// Chỉ nói nội quy CLB thôi nhe, mọi người theo đó mà làm, tự mỗi người
// Chốt hạ: INTERFACE chứa hàm ABSTRACT
// ko cần ghi ra từ khóa abstract ở cả tên của clb và tên hàm
// Vì CLB hàm ý/ ngầm hiểu chỉ có nội quy để mọi người theo, nội quy chung chung
// để mọi người theo - IMPLEMENT - Ngầm hiểu Interface là abstract
// Abstract là nêu ý tưởng

// JDK sau cho phép INTERFACE có hàm code nhưng...!!!
public interface DeathRacer {

    // phàm ai đã chọn nghề tham gia đua thủ, thì phải đua!!
    // public abstract double runToDead(); // ko cần từ abstract
    public double runToDead();
    public void showHowToDead(); // gáy bằng tổ quốc ghi công!!!
    

}
