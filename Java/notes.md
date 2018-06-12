
JDK
- java development kit
- development and running
- gives a development environment

JVM
- java virtual machine
- everything runs in the jvm, if something goes wrong it is only in the jvm not the operating system
- loads, verfies, executes code

JRE
- provides the java runtime environment
- responsible to run the application
- JRE helps run JVM

JDK = JRE + JVM

__Path__
- when you open the eclipse, tells the tools where it is installed
- enviornment variable used to locate java tools
- used at Operation system level

__Classpath__
- used by JVM to locate class libraries

__JavaC__
- compiles the java file

java files have extension .java --> hello.java
you will complile it with the help of javac 
then the extension will be .class --> hello.class

then you write just the file name --> hello

java is platform independent
- doesn't matter the operating system
- complile once, execute anywhere
- just need jdk, jvm

__What is Java?__
- originally named Oak
- oo class-based programming language designed to have as few implementation dependencies as possible
- intended to "write once, run anywhere" (WROA) - meaning compliled java code can ru on all platforms without th need for recompilation
- typically compilled to bytecode 
- developed after C and C++

__Where it is used__
- desktop applications
- enterprise applications
- mobile
- games

__Standalone Application__
- these are traditional software that we need to install on every maching
- i.e. media player, antivirus
- AWT and Swing are use to create standalone apps

__Web Application__
- runs on the server side and creates dynamic page
- servlet, jsp, struts, sping, hibernate, jsf

__Enterprise Application__
- application that is distributed in nature
- high-level security
-EJB

__Mobile Application__
- Android and Java ME

__secured__
- no explicit pointer - no security problems
- exception handling and type checking - gives a clear message when there is an error

__Automatic Garbage Collector__
- JC
- no need to remove ureference objects

__Object Oriented__
1. Class
2. Object
    - having behaviors, properties
3. Inheritance
    - the property of the child class inherits the same code from the parent class
4. Polymorphism
5. Abstraction
6. Encapsulation

- we'll write the real world scenario

- objects perform actions, called methods
- if the car is object
- brake is method

__multi-threaded__
- a thread is like a separate program
- able to divide a process known as a thread
- multiple threads working so it takes less time

__set path in Java__
1. temporary
2. permanant 

__public__ means anyone will be able to access it
__private__ means no other class will be able to access it
if public, private, or protected is not specified, then it is __default__

instance variable
- 

local variable
- 

object
- instance of a class

__how to take input from User in Java__
- import java.util.Scanner class
 or util.* for all the classes
- create object of scanner class
- use built-in methods to take input

Scanner sc  = new Scanner (System.in);
int int1;
String string1;
System.out.println("Enter the value of integer int1:");
int1 = sc.nextInt();
System.out.println("Enter the value of string string1:");
int1 = sc.nextInt();
sc.close();

__Types of Variables in Java__
1. Primitive Variable
    - used to represent primitive values - int, string, float
2. Reference Variable
    - used to refer objects

- Instance Variable
    - same as scope of Object variable
    - should declare within the class directly, but outside any block method or constructor

- Static Variable
    - uses static keyword

- Local Variable 
    - Scope: block, method, constructor

__Constructor in Java__
- special type of method that is used to initialize the object
- constructor name must be the same as its class name and must not have an explicit return type

__Types of Contructors__
1. Default Contructor
2. Parameterized Constructor

__Constructor Overloading__
- calling a paramaterized construtor, then calling a default constructor

__Inheritance__
- the mechanism of deriving  a new class from the old one
- Old class is known as __Superclass__
- New class is known as __Subclass__
- Subclass inherits all instance variables and methods defined by superclass and it also adds its own unique elements

__Types of Inheritance__
- Single
    - child and parent class relationship where a class extends the other class
- Multi-level
    - child and parent relationship where more than one class exends the same class
- Hierarchical
    - Base Class --> Child1 Class | Child2 Class | Child3 Class

Super Class --> Base Class --> Child Class

__Static Variable__
- common to all instances because it is a class level variable
- only a single coply o a static variable is created and shared among all instances

__Types of Variables__
1. Primitive
    - int, string, long, short, double, float
    - must create an object in order to access this variable

2. Reference
    - Instance Variable
        - variable which you will declare after the class
        - for every instance, the value resets, is different for every object
        - __the value varies from object to object__
        - you're able to initialize an instance variable without initialization

    - Static Variable
        - without creating the object, you will be able to call the method
        - if you make the instance variable static, then you will be able to call the instance variable without creating an object
        - __values are not varied, it stays the same for all objects__
        - static is also called "class level variable"
        - can be used to refer the common property of all objects
        - gets memory only once in a class area at the time of class loading
        - initilization is optional

    - Local Variable
        - you can declare a local variable in a block, constructor or method
        - must initialize before using it

__Method Overloading__
- i.e. addNumbers(A,B) or addNumbers(2,3,5,6)
- using parameters in a method
- many methods in a class have the same name but different signatrue
- also called _Polymorphism_

__Method Overriding__
- overriding the default values in the method with parameters
- override the functionality of an existing method

__This__

__Super__
- reference variable that is used to refer immediate parent lass object

__Final__
- when you want to make something constant
- final variable
    - constant value, cannot be changed
- final method
    - cannot be overridden
- final class
    - cannot be inherited

__Static__

__Wrapper Class__
- i.e. int i = 100
- integer obj = Integer.valueOf(i); - called __autoboxing__
- int i = obj.intValue() - called __unboxing__

__Package__
- group of similar types of classes, interfaces and sub-packages
- existing packages:
    - lang
        - java.lang is the most important package of the java API 
        - provides classes that are fundemental to the design of the Java language
    - util
    - awts

__Garbage Collection__
- garbage is unreferenced object
- the process of reclaiming the unsused runtime memory
- advantage - make java more efficient, automatically done by the jvm
- if you nullify an object it becomes a candidate for garbage collection
- finalize runs before System.gc()
- you give the finalize() one wish before the garbage collector comes
- __finalize__
    - invoke before object is garbage collected
- __gc()__
    - invoke the garbage collector

__Object class__
- the parent class of all the classes in java by default
- provides some common behaviors so objects can be compared, cloned , notified
- the obkect class provides many methods
    - getClass()
        - returns the Class class object of the object
    - public Int hasCode()
        - returns the hashcode number of the object
    - public boolean equals(Object obk)
        - compares the given obkect to this object
    - clone()
    - String toString()
    - notify(), notifyAll()

__Abstraction__
- the process of separating ideas from their action
- it is used to separate ideas from their implementation
- it is used to define only ideas in one class so that the idea can be implemented by its sub classes according to their requirements 
- we can't create objects to those classes which are declared as abstract
- we can create objects to sub classes of abstract
- abstract methods cannot be private, must be implemented somehow in the sub classes

__Concrete__
- concrete method is the normal method

__Interface__
- contain only abstract methods (only ideas), NO concrete methods
- shows 100% abstractness
- declared with the keyword interface
- interface can have two types of methods
    1. Fields (such as variable) - public, static and final by default
    2. Methods
- methods are abstract by default, don't need to declare the abstract keyword
- SIB - Static Initialization Block and IIB - Instance Intialization Block are not allowed in interfaces
- Java cannot extend more than one class, but a class can implement more than one interface - this is how multiple inheritances are implemented in Java

__StringBuffer__
- peer class of String that provides functionality of strings
- represents fixed-length immutable character sequences

__Exception__
- runtime error - when the error occurs when running the program causing the program to terminate
- __Try-Catch Block__
    - method that will give the exception
- a problem that arises during the execution of a program
- Exception Handling is a task to maintain normal flow of the program, but does not mean repairing the exception - it is defining a alternative way to continue rest of the program normally
    - i.e. User entered invalid data, file not found
1. Checked
    - checked by compiler at runtime
2. Unchecked    
    - not checked by compiler at runtime
- within the try block if an eception occurs, the rest of the rey block won't be executed
- __Multiple-Catch Block__

- Finally Block
    - code in finally block always executes, whether or not exception has occured
    - it allows you to run any cleanp-type statement that you want to execute


__Methods__
- tostring()
    - name of exception: description
- getMessage
    - discription only

__Handling Exception Keywords__
1. try
2. catch
3. finally
4. throw
    - used to explicitly throw an exception
    - throw new AritmeticException("----")
5. throws

__throws__
- required only for checked exceptions
- required only ot convince compiler to provide information to the caller of the method about the exception

__Checked vs. Unchecked__
- checked
    - are the exceptions that are checked at complie time
    - if method throws a checked exception, the method must either handle the exception or it must specify the exception using the _throws_ keyword

- unchecked
    - 

__Data Structure__
- a way of storing and organizing data
- used to reduce complexity of the code

1. Static
- the sze of the structure is fixed
- the content can be modified but without changing the memory space allocated to it
- i.e. Array

2. Dynamic
- size of the structure is not fixed and can be modified
- can be randomly updated during run time

__hashCode() Method__
- returns the hashcode value as an integer

__Arrays vs. Collections__
- Arrays
    - fixed in size
    - Wrt memory arrays are not recommended for use
    - Wrt Performace Arrays are recommended to use
    - can hold only homogeneous datatype elements
    - no underlying data structure
    - can hold both primitive and object types
- Collections
    - growable
    - Wrt memory collections are recommend
    - Wrt Perfomance collections are not recommended
    - can hold both homogeneous and heterogeneous elements
    - based on data structure
    - can hold only objects but not primitives

__Comparable__
- capable of comparing itself with another object
- the class must implement the java.lang

__Comparator__
- external to the element type we are comparing
- it's a separate class

__Thread__
- smallest executable unit of a process
- lightweight operations - whereas a process is a heavyweight application, takes time
- a process can have multiple threads

__Multitasking__
- multiple tasks are performed simultaneuosly
- can be process-based or thread-based

__Multithreading__ _thread-based multitasking_
- multple threads in a processe are executed simultaneously


__Questions__
- Why do we have to compile a java program?
- Do I have to recompile it after I change the program?
