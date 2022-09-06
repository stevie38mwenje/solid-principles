Single Responsibility Each class should have only one sole purpose, and not be filled with excessive functionality
        - A module should be responsible to one and only one actor.

Open Closed Classes should be open for extension, closed for modification. In other words, you should not have to rewrite an existing class for implementing new features.
        - Software entities -- modules, classes, functions--  should be open for extension but closed for modification

Liskov Substitution Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T. This means that every subclass or derived class should be substitutable for their base or parent class

Interface Segregation Interfaces should not force classes to implement what they can’t do. Large interfaces should be divided into small ones.

Dependency Inversion Components should depend on abstractions, not on concretions.