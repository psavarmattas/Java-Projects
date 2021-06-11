//Write a program in java to demonstrate multilevel inheritance in java.

public class MultiLevelInheritance { 
    void eat() {
            System.out.println("eating...");
        }  
    }  
    class Dog extends MultiLevelInheritance {  
        void bark() {
            System.out.println("barking...");
        }  
    }  
    class BabyDog extends Dog {  
        void weep() {
            System.out.println("weeping...");
        }  
    }  

class TestInheritance {  
    public static void main(String args[]) {  
        BabyDog d=new BabyDog();  
        d.weep();  
        d.bark();  
        d.eat();  
    }
}
