import java.util.ArrayList;

public class VarTest
{
    // scope of var

    // NOT ALLOWED
    // instance variable var
    // var field;

    // method parameter and return type
    // var method(var x);

    public static void main(String[] args) 
    {
        // var introduced in Java 10

        // compiler infers String
        var name = "Java";
        var number = 42;
        var list = new ArrayList<String>();

        // no initialization causes an error unlike javascript
        // this is because var is static and not dynamically typed like javascript

        // var x;

        var z = 3.14;  

        // compile error (String not assignable to double)
        // z = "hello"; 

        // error, can't initialize with null
        // var n = null;

        // valid
        var s = (String) null;

        // works with loops
        for (var i = 0; i < 5; i++) 
        {
            System.out.println(i);
        }

        // var can infer annonymous classes
        // var can be used INSIDE local variables in lambda, but can't use 
        // var in lambda parameters
        var obj = new Object() {
            void sayHi() { System.out.println("Hi"); }
        };
        obj.sayHi();
        
    }
}