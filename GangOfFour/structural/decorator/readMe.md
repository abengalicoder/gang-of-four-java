# Decorator Pattern

A decorator pattern can be used to attach additional responsibilities to an object either strategically or dyncamically.

We use inheritence or composition to extend the behavious of an object but this is done at complier level and its applicable to all the instances of the class. We cannt add any new functionalities at run time - this is when **Decorator pattern** comes into picture.

 
Car <- Basic Car <- Sports Car
				 <- Luxury Car
				 
				 
Its look into the hierarchy model. If we need a car which is having both sports & luxury?

If we apply more inheritence or compisition to this level, it will get more complex.

4 things, you need when you implement decorator pattern
1. Component
2. Concreate Component
3. Decorator
4. Concreate Decorator

				 