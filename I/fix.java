interface ICooker {
    void cooking();
}
interface ICleaner { 
    void cleaning();
}
interface IReceptionist { 
    void reception();
}
class AllInOneSuperman : ITask {
    public void cooking(){
        //Nấu nướng
    }
    public void cleaning(){
        //dọn dẹp
    }
    public void reception(){
        //Phục vụ
    }
}
class Cleaner: ITask {
    public void cleaning(){
        //Yes, có thể dọn dẹp
    }  
}