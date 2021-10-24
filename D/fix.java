public interface IEmployee {
    int bonusSalary();
}
public class Developer implements IEmployee {
    private int salary;
    public Developer(int salary){
        this.salary =salary;
    }
    @Overide 
    public int bonusSalary(){
        return salary * 2;
    }
}
public class QC implements IEmployee {
    private int _salary;
    public Retire(int _salary){
        this._salary = _salary;
    }
    @Overide 
    public int bonusSalary(){
        return _salary * 1.2;
    }
}
public class Employee{
    private Employee employee;
    public void setEmploy( Employee employee){
        this.employee =employee;
    }
    public int bonusSalary(){
        return this.employee.bonusSalary();
    }
}
