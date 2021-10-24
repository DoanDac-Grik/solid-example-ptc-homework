public class Car {

}
public class PetroleumSuperCar extends Car {
    public void consumeFuel(){
        System.out.println("Uống xăng như nước lã");
    }
}
public class Lambo extends PetroleumSuperCar {
    @Override 
    public void consumeFuel(){
        System.out.println("Một ga hết 1l xăng :D ");
    }
}
public class Bugati extends PetroleumSuperCar {
    @Override 
    public void consumeFuel(){
        System.out.println("Một ga hết 2l xăng :D ");
    }
}

public class ElectroSuperCar extends Car {
   
}