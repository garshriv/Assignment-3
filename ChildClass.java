class Parentclass{
    String name = "Garima";
    Parentclass(){
        	System.out.println("Parent class constructor");
    }
   void display(){
     	System.out.println("Parent class method");
   }
}
public class ChildClass extends Parentclass
{
    String name = "Garima Shrivastav";
    ChildClass(){
        super();
        	System.out.println("Child class constructor");
    }
   void printMsg(){
    	display();
    	
    	String name = "Shrivastav Garima";
	    System.out.println("Child class method");
		System.out.println("Parent class variable ="+super.name);
		System.out.println("Child class instance variable ="+this.name);
		System.out.println("Child class local variable ="+name);
   } 
   public static void main(String args[]){
		
	ChildClass obj= new ChildClass();
        obj.printMsg(); 
   }
}