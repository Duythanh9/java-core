package Java.bai003;
//đa kê thừa
public class UserService implements SampleInterface, EmployeeInterface{

    @Override
    public void getName() {
        System.out.println(name);
        
    }
    
    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello xin chào");
    }

    public static void main(String[] args) {
        System.out.println(name);
        UserService userService = new UserService();
        userService.sayHello();
        userService.printName();
    }
    
}
