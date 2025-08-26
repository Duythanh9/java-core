package Giao_lang.Live.AmazingRace.data;

// Cha là nhân tử chung của đám Con
// việc riêng, dị biệt để ở đám Con lo
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weight;

    // protected double speed; cassh 1 sort




    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    //   public double getSpeed() {
    //     return speed;
    // }

    // public void setSpeed(double speed) {
    //     this.speed = speed;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // hành động chạy và việc khoe, gáy thành tích sure abstract
    public abstract double run(); // chạy khác nhau

    public abstract void showRecord(); // gáy thành tích

  
}
