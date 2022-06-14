package demo;

import org.springframework.stereotype.Component;

@Component //Annotation in Spring Boot
public class student {

    private static String name; // Name variable to use constructor, getter & setters

    public static String getName() { // Get Method to get the value of variable name
        return name;
    }

    public void setName(String name) { // Set Method to set the value of variable name
        student.name = name;
    }

// Constructor method with old config in spring.xml
//    public student(String name) {
//        student.name = name;
//        System.out.println(name);
//    }

    public void studyJava(){ // Random method created to check the working of this class
        System.out.println("Student is studying java");
    }
}
