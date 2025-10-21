# Chapter 1

-> Handling Date, Time, Text, Numeric and Boolean Values

-> primitives, wrapper classes. Evaluate arithmetic and boolean expresisons, Math API and precedence rules, type conversions, casting.

-> Declare and instantiate Java objects (nested class objects,object life cycle, creation, reassigning references and gc)

-> Variable scopes, encapsulation, create immutable objects. Local variable type inference

# Major Components of Java

-> javac: Converts .java source files into .class bytecode

-> java: Executes the program

-> jar: Packages files together

-> javadoc: Generates documentation

javac program generates instructions in a special format called **bytecode** that the java command can run.
Then java launches the **JVM** before running the code. JVM runs your .class file within your operating system and hardware.

# Before Java 8 
-> you could download JRE instead of the full JDK.  The JRE was a
subset of the JDK that was used for running a program but
could not compile one. Now, people can use the full JDK
when running a Java program

# Building Blocks - Class Structure
-> Classes are basic building blocks. 

-> To use classes, we create objects. An object is a runtime instance of a class in memory. 

-> Classes have two primary elements: fields(variables) and methods

# Comments
-> Non-executable code

# Classes and Source Files
-> Most of the time, each Java class is defined in its own .java file

-> For this chapter, A top-level type is a data structure that can be defined independently within a source file. 

-> A top level class is often of type public (can be accessed anywhere). Java however doesn't require the type to be public.

-> when you have two types in the same file (Ex: class Animal and class Animal2 only one is allowed to be public "the topmost")

-> the public type has to match the filename

# main() Method
-> A java program begins execution with its main() method. It is the starting point that the JVM looks for when it begins running a new program.

    # Summary of rules
    -> Each file can contain only one public class
    -> The filename must match the class name, including case, and have a .java extension
    -> If the Java class is an entry point for the program, it must contain a main() method
    -> static binds a method to its class, so it can be called by the class name without needing to create an instance of the class

# Package Declarations and Imports
-> Java puts classes in **packages** (similar to a file cabinet)

-> import tells the compiler which package to look in to find a class

-> package names are hierarchical

-> wildcard '*'. The import statement doesn't bring in child packages, fields, or methods; it only imports classes under the package.

# Redundant imports
-> There’s one special package in the Java world called java.lang. This package is special in that it is automatically imported. You can type this package in an import statement, but you don’t have to.

-> You can't use wildcards '*' and assume it'll look for path names and files, it only works with classes in the same package

# Naming Conflicts
-> One of the reasons for using packages is so that class names don’t have to be unique across all of Java. This means you’ll sometimes want to import a class that can be found in multiple places.

# Constructors
-> used to initialize fields




