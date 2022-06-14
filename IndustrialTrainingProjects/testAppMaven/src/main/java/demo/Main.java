package demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Getting application context and configuring class path of the xml file
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        student st = context.getBean(student.class); // Spring get bean method
        st.studyJava(); // Calling the method studyJava from student class
        System.out.println(student.getName()); // Using get name method to print the value of variable name
    }
}