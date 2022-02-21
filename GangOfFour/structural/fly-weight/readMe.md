**Flyweight** pattern is one of the structural design patterns as this pattern provides ways to decrease object count thus improving application required objects structure. Flyweight pattern is used when we need to create a large number of similar objects (say 105). One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been constructed.

**Why do we care for number of objects in our program?**

Less number of objects reduces the memory usage, and it manages to keep us away from errors related to memory like java.lang.OutOfMemoryError.
Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.

**Real-world example**

Alchemist's shop has shelves full of magic potions. Many of the potions are the same so there is no need to create a new object for each of them. Instead, one object instance can represent multiple shelf items so the memory footprint remains small.

**In plain words**

It is used to minimize memory usage or computational expenses by sharing as much as possible with similar objects.

