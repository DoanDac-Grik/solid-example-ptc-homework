public class Developer {
    public int getSalary();
}
public class Employee {
    private Developer dev;         
    public Employee(){

    }
    public void setDev(Developer dev){
        this.dev = dev;
    }
    public int bonusSalary(){
        return dev.getSalary() * 2;
    }
}