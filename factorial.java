import java.util.*;
class Factorial{
    private int num1;
    private int fact=1;
    void inp(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number :");  
        num1= sc.nextInt(); 
        sc.close();
    }
     void factt(){
         while(num1>1){
             fact=fact*num1;
             num1--;
         }
         System.out.println(fact);
     }
    public static void main(String[] args){
        System.out.println("My Factorial function in Java\n");
        Factorial myobject =new Factorial();
        myobject.inp();
        myobject.factt();
    }
}
