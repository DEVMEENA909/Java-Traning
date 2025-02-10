public class Constructors{
    public static void main(String args[]){
        Student s1= new Student();
        s1.name = "dev";
        s1.roll = 77;
        s1.password = "abcd";
        s1.marks[0] = 44;
        s1.marks[1]= 33;
        s1.marks[2] = 45;
        Student s2 = new Student(s1);
        s2.password = "new";
        s1.marks[2] =99;
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }

}
class Student{
    String name;
    int roll;
    String password;
    int[] marks;
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }
    // Student(String name){
    //     this.name = name;
    // }
    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    // Deep copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name= s1.name;
        this.roll = s1.roll;
        for(int i= 0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}