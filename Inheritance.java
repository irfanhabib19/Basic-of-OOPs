package OOPs;

/**
 * Inheritance
 */
public class Inheritance {
public static void main(String[] args) {
   dog tom=new dog();
   tom.eat();
   tom.bark();
}
}
 class animal {
void eat(){
    System.out.println("eating ");
}
void breath(){
System.out.println("breating");
}  
 }
 // single inherited class 
 class fish extends animal {
    void swim(){
        System.out.println("swimming");
    }   
 } 
 
  class mammal extends animal  {
    int legs;
    String color; 
 }
/**
 multiple inherited class
 */
 class dog extends mammal {
    void bark(){
        System.out.println("barking");
    }

    
}

