
public class main {
    public static void main(String[] args) {
        /*
            syntax of if statement:
            if(condition){
                //code to be executed if condition is true
            }
        */

        int salary=25400;
        if(salary>10000){
            salary=salary+2000;
        }else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }
    
}
