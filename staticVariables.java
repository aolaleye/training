/* 
Java – static variable with example
A static variable is common to all the instances (or objects) of the class because it is a class level variable. In other words you can say that only a single copy of static variable is created and shared among all the instances of the class. Memory allocation for such variables only happens once when the class is loaded in the memory.
Like variables we can have static block, static method and static class, to read about them refer: static keyword in java.
Static variable Syntax
static keyword followed by data type, followed by variable name.
static data_type variable_name;
As I mentioned above that the static variables are shared among all the instances of the class, they are useful when we need to do memory management. In some cases we want to have a common value for all the instances like global variable then it is much better to declare them static as this can save memory (because only single copy is created for static variables).
lets understand this with an example: 
*/

// Static variable example in Java
class VariableDemo
{
   static int count=0;
   public void increment()
   {
       count++;
   }
   public static void main(String args[])
   {
       VariableDemo obj1=new VariableDemo();
       VariableDemo obj2=new VariableDemo();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.count);
       System.out.println("Obj2: count is="+obj2.count);
   }
}
/* 
Output:
Obj1: count is=2
Obj2: count is=2
As you can see in the above example that both the objects are sharing a same copy of static variable that’s why they displayed the same value of count.

Example 2: Static Variable can be accessed directly in a static method
*/

class JavaExample{
  static int age;
  static String name;
  //This is a Static Method
  static void disp(){
      System.out.println("Age is: "+age);
      System.out.println("Name is: "+name);
  }
  // This is also a static method
  public static void main(String args[]) 
  {
	  age = 30;
	  name = "Steve";
      disp();
  }
}

/*
Output:
Age is: 30
Name is: Steve

Static variable initialization
1.	Static variables are initialized when class is loaded.
2.	Static variables are initialized before any object of that class is created.
3.	Static variables are initialized before any static method of the class executes.
Default values for static and non-static variables are same.
primitive integers(long, short etc): 0
primitive floating points(float, double): 0.0
boolean: false
object references: null
Static final variables

The static final variables are constants. Lets have a look at the code below:
*/

public class MyClass{
   public static final int MY_VAR=27;
}

/*
Note: Constant variable name should be in Caps! you can use underscore(_) between.
1) The above code will execute as soon as the class MyClass is loaded, before static method is called and even before any static variable can be accessed.
2) The variable MY_VAR is public which means any class can use it. It is a static variable so you won’t need any object of class in order to access it. It’s final so the value of this variable can never be changed in the current or in any class.
Key points:

final variable always needs initialization, if you don’t initialize it would throw a compilation error. have a look at below example-
*/

public class MyClass{
    public static final int MY_VAR;
}

// Error: variable MY_VAR might not have been initialized

