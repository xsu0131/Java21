package SealedInterfaceGeneric;

public sealed interface Animal<T> permits Panda, Python, Bird
{
    T makeSound();
}

// interface extending sealed
// interface can't implement another interface
non-sealed interface Python extends Animal<String>
{
    // can add more abstract methods or non-abstract methods
}


