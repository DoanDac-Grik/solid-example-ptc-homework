public class PetroleumSuperCar extends Car {
    public void consumeFuel(){
        System.out.println("Uống xăng như nước lã");
    }
}
public class Lambo extends SuperCar {
    @Override 
    public void consumeFuel(){
        System.out.println("Một ga hết 1l xăng :D ");
    }
}
public class Bugati extends SuperCar {
    @Override 
    public void consumeFuel(){
        System.out.println("Một ga hết 2l xăng :D ");
    }
}
//Siêu xe điện Telsa thì không dùng xăng, nên không thể kế thừa ở lớp supercar
public class Telsa extends SuperCar {
    @Override 
    public void consumeFuel(){
        System.out.println("Bruh, xe xài điện");
    }
}