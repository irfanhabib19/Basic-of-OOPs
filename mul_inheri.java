package OOPs;
// hierarchial inheritance

public class mul_inheri {
    public static void main(String[] args) {
        boys kakashi=new boys();
        kakashi.intro("kakashi");
        
    }
}
class students{
    void intro(String name  ){
        System.out.println("my name is "+name);
    }
}
class boys extends students{
    void hair(){
        System.out.println("short hair");
    }
}
 class girls extends students{
    void hair(){
        System.out.println("Long hair");
    }
 }