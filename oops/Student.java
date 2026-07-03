public class Student  {
    int id;
    String name;
    int rollno;
    String department;                  //attributes
    


    Student(int id,String name,int rollno,String department){
        this.id =id;
        this .rollno = rollno;                 //constructor
        this .name = name;
        this .department = department; 
    }
void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(rollno);
    System.out.println(department);                 //Method
}
public static void main(String[] args) {
    

Student s1 =new Student(101,"Nevil",62,"cse" );    //object creation
s1.display();                                        //display
    }
}