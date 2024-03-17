package projects.KTr;

/*

When defining methods in code make sure to show the complete function signatures. 
The arguments (parameters) and return type cannot be empty for all these functions.
In UML diagrams you might get away without it, but not in code.


[1]
When defining methods in code make sure to show the complete function signatures. 
The arguments (parameters) and return type cannot be empty for all these functions.
In UML diagrams you might get away without it, but not in code.
[2]
Your diagram shows an inheritance relationship between Inventory and Guitar and your code shows nothing about that. The inheritance relation going from Inventory to Guitar is not useful and does not make sense.
Is inventory a guitar?


When defining methods in code make sure to show the complete function signature.
The arguments (parameters) and return types cannot be just left empty.
The code should compile and reflect the diagram logic.
The Inventory class you have is probably the InventoryItem parent class.
I don't see the inventory application or class though. The class that holds all the items and ives us the means to add. remove and search for guitars.


Guitar inheriting from Inventory is probably not a good idea. It means this: Guitar is a inventory.

Which is a false statement. A guitar is an Inventory Item but not the inventory itself.

The Guitar class has no constructor or public method, and everything is defined as private. The class is not usable. When adding code put more effort into creating something that would actually work.

To show aggregation use proper UML notation (diamonds).


*/