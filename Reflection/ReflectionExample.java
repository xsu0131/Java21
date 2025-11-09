package Reflection;

import java.lang.reflect.*;

public class ReflectionExample
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();

        // Quesstion 1: Access private field name
        // Get the class object
        Class<?> cls = person.getClass();

        // Access the private field "name" using Reflection
        Field field = cls.getDeclaredField("name");

        // make the private field accessible
        field.setAccessible(true);

        // Modify its value
        field.set(person, "Jhonny");

        System.out.println("We modified the field value to:" + field.get(person));

        // Question 2: Access private method using Reflection
        Method method = cls.getDeclaredMethod("displayInfo");

        // allow private access
        method.setAccessible(true);

        // call the method
        method.invoke(person);
    }
}
