In java Every Application begins with a class name and the class must match the file name.

## Example

```java
public class Main{
    public static void main(String[] args){
        System.out Println("Hello World")
    }
}

```
After saving the file as Main.java open the terminal on Linux or macOs and cmd.exe if on windows.

Navigate to the dir where the file is located and run it using 

```bash
javac Main.java
```
This will compile your code. If there are no errors in the code, the command prompt or the terminal (depending on your preffered Os) will take you to the next line. Now, type "java Main" to run the file:

```bash
java Main
```
The Output Should Read: 
```bash 
Hello World
```
### Example Explained

As it was Stated earlier each line of code written in java must be inside a class. In our example we named our class ```Main``` each class name must start with a capital/uppercase Letter.

***Note*** Java is case Sensitive ```Myclass``` and ```myclass``` are two different things.


### The main Method

The main () method is widely used in java. It looks something like this 

```java
public static void main(String[] args)
```
Any code inside the method ```main``` will be executed. Remember that every Java program has a ```class``` name which must match the filename, and that every program must contain the ```main()``` method.

### System.out.println()
Inside the ```main``` method we can use the ```println``` method to print a line to the screen.

```java
public static void main(String[] args){
System.out println("Hello There");
}
```
***Note*** The curly {} braces marks the beginning and the end of a code block ```System``` is a built-in Java class that contains useful members, such as ```out```, which is the short for "output". The ```println()``` method, short for "print line", is used to print a value to the screen (or a file).

Each code statement must end with a semicolon ";"




