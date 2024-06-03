package OOPs;

public class Object {
  
    public static void main(String[] args) {
        Pen agni=new Pen();
        agni.setColor("red");
        agni.setTip(24);
        System.out.println(agni.getColor());
        System.out.println(agni.getTip());
      
    }
}
  class Pen{
   private String color;
   private int tip;
    void setColor(String x){
        this.color=x;
    }
    String  getColor(){
        return this.color;
    }
    int getTip(){
return this.tip;
    }
    void setTip(int newTip){
       this. tip=newTip;
    }
}
