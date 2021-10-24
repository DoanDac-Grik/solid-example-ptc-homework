interface ITask {
    void cooking();
    void cleaning();
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
    public void cooking(){
        throw new NotSupportException();
    }
    public void cleaning(){
        //Yes, có thể dọn dẹp
    }
    public void reception(){
        throw new NotSupportException();
    }
}