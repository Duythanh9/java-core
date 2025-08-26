package Giao_lang.Live.AmazingRaceV2.data;

import java.util.Random;

// Chơi thêm kế thừa, Motor is a kind of Vihicle (abstract class)

// MOTOR mua về chạy đi học, chuyện bth, hàm run()
// Nhưng trên đường thằng vớ vẩn nào đó nó nẹt-pô, mình kéo tay ga mạnh hơn
// Bốc đầu, vọt xe, tốc độ phải dữ hơn bth, lúc này ngoài việc MOTOR
// Thông thường, ta còn là đua thủ nữa, pải là đua thủ mới có tốc độ cao
// gia nhập hội đua thôi, chỉ đua thôi
// Tớ cò là 1 đua thủ, ko dùng từ khóa EXTENDS, xài từ là 1 MEMBER của
                                            // IMPLEMENT
                                            // TỚ tham gia CLB, triển khai việc đua
// Tham gia CLB nào thì phải có hành động của CLB nó
// IMPLEMENTS all Abstract Methods bên CLB, Chọn đi đua mà ko chịu đua sao đc       
// @Override
// class chính của chúng ta cứ có đặc điểm hành vi như bth
// Chúng ta tham gia CLB nào thì có thêm hoạt động của CLB đó, @Override hoạt động đó
// Trong ta có nhiều hành động ứng với từng CLB ta tham gia, hợp lí ngoài đời
// Đi với bụt mặc áo cà sa, đi với ma mặc áo giấy     
// Về logic, ta có thể tham gia N CLB, nhưng ta chỉ có 1 dòng họ
// Trong JAva, 1 con tối đa 1 Cha, đơn kế thừa
                        //  1 con tham gia N CLB, vậy sẽ có hành động của N CLB
// C++, 1 con nhiều cha luôn, đa kế thừa                   
//                                
public class Motor implements DeathRacer{
    public static final double MAX_SPEED = 180;
    private String model; // Exciter 2021, Winner 2020
    private String volume; // Số phân khối 125.0cm3
    private String vin; // biển số, số khung, Vehicle Indentifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor [model=" + model + ", volume=" + volume + ", vin=" + vin + "]";
    }

    // hành vi xe máy là chạy, có tốc độ đc ghi nhận
    public double run() {

        return new Random().nextDouble() * Motor.MAX_SPEED;
    }// chạy ngẫu nhiên và ko quá 180km

    // quay video và gáy tốc độ
    public void showRecord() {
        
    }                                   // 150.0cm3  // 58F8-67.89   

    @Override
    public double runToDead() {
        // Chạy tốc độ cao thôi, đôn nòng, xoáy nòng, ép dên
        return run() * 3; // run() giả sử đc 150 x 3 đua đến chết còn gì?!
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-15s|%-10s|%-9s|%-12s|%-5.1f|\n",
                "Motor-Racer", model, volume, vin, runToDead());
    }
}
