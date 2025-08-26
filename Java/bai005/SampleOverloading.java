package Java.bai005;

public class SampleOverloading {

    public int add(int a, int b){
        return a + b;
    }

    public int add(float a, float b){
        return (int)(a - b);
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}
