Vehicle Management System

A. Project Overview

This project demonstrates Object-Oriented Programming principles using a Vehicle Management System.
The system uses inheritance, abstraction, composition, and aggregation to model different types of vehicles and their drivers.

An abstract Vehicle superclass defines common behavior, while subclasses (Car, Motorcycle, Truck) provide specialized implementations.

B. Class Hierarchy

Vehicle (abstract)

Fields: brand, year, driver

Abstract methods: startEngine(), stopEngine()

Concrete method: displayInfo()

Car, Motorcycle, Truck

Inherit from Vehicle

Override engine methods

Add subclass-specific fields

Driver

Represents drivers

Demonstrates composition and aggregation

Access Modifiers Used:

protected for inherited fields

private for encapsulation

public for methods and constructors

C. Compile and Run Instructions
javac *.java
java Main

D. Screenshots
<img width="827" height="644" alt="image" src="https://github.com/user-attachments/assets/14792df5-3f85-4375-97e8-6c301dfef07a" />



E. Reflection

Inheritance simplified the design by allowing all vehicles to share common attributes and behaviors through the abstract Vehicle class. This reduced code duplication and made the system easier to extend with new vehicle types.

Method overriding allowed each subclass to customize engine behavior while maintaining a common interface. The main challenge was understanding when to use protected versus private fields to balance encapsulation and inheritance flexibility.
