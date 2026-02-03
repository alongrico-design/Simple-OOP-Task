
public class Student {

    String name;
    int age;
    String course;
    
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    
    }
    
    void displayinfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        
    }
    
}
