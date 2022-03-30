# Singleton Pattern

Singleton design pattern comes under creational design pattern and is a part of “Gang of Four Design Pattern”.

Singleton design pattern ensures that there would be only instance created **per JVM** and the single object will be shared across all the classes or throughout the application. 

## How to create Singleton design pattern
```
1.	Static member: This contains the instance of Singleton object.
2.	Private constructor: This will prevent our class from anybody to create object from outside.
3.	Static factory method: this is the factory method for outside word to get only one / single instance of our class.
```

### You can create a singleton instace in below ways:

```
1.	Eager Loading
2.	Lazy Loading
3.	By Make getInstance() synchronized
4.	Double Checked Locking
5.	Using enum
```


