
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

__Questions__
- Why do we have to compile a java program?
- Do I have to recompile it after I change the program?
