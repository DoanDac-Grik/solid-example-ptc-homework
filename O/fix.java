interface CaculateGPA {
    public double gpa();
}

//Class Grade A
public class A{
    public double Toan;
    public double Li;
    public double Hoa;
    public double gpa(){
        return ((Toan*2)+ Li+ Hoa)/4;
    }
}
//Class Grade B
public class B{
    public double Toan;
    public double Sinh;
    public double Hoa;
    public double gpa(){
        return ((Sinh*2)+ Toan+ Hoa)/4;
    }
}
//Class Grade C
public class B{
    public double Van;
    public double Su;
    public double Dia;
    public double gpa(){
        return ((Van*2)+ Su+ Dia)/4;
    }
}