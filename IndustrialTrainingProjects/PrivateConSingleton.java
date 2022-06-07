// Program to implement private constructor using the singleton method.

package IndustrialTrainingProjects;

public class PrivateConSingleton {
    private PrivateConSingleton () {
        System.out.println("This is a private constructor.");
        }
        
        public static void instanceMethod() {
    
        PrivateConSingleton obj = new PrivateConSingleton();
        }
    
    }
    
    class Main {
    
        public static void main(String[] args) {
        PrivateConSingleton.instanceMethod();
        }
    }