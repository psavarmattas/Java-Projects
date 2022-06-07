// Program to implement private constructor using the basic method.

package IndustrialTrainingProjects;

public class PrivateConBasic {
    public static void main(String[] args){
        PrivateConBasic obj=new PrivateConBasic("Hello");

    }
    private PrivateConBasic(String a){
        System.out.println(a);
    }
}
