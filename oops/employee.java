public class employee {
    private int id;
    private String name;
    private double salary;

    employee(int id,String name,double salary){
        this.salary=salary;
        this.id =id;
        this.name=name;

    }
void display(){
    System.out.println("id : " +id);
    System.out.println("name: " +name);
    System.out.println("salary: " +salary);
}
public static void main(String[] args) {
    employee e1 = new employee(101,"Nevil",3500);
    e1.display();
    }
}
