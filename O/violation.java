//Class Grade A
public class A{
    public double Toan;
    public double Li;
    public double Hoa;
}
//Class Grade B
public class B{
    public double Toan;
    public double Sinh;
    public double Hoa;
}
//Class Grade C
public class B{
    public double Van;
    public double Su;
    public double Dia;
}
//class caculate GPA 
public class CaculateGPA {
    public double gpa(Object grade){
        if(grade instanceof A){
            A a = (A)grade;
            return ((a.Toan*2)+ a.Li+ a.Hoa)/4;
        } else  if(grade instanceof B){
            B b = (B)grade;
            return ((b.Sinh*2)+ b.Toan+ b.Hoa)/4;
        } else  if(grade instanceof C){
            C c = (C)grade;
            return ((c.Van*2)+ c.Su+ c.Dia)/4;
        } 
    }
}
