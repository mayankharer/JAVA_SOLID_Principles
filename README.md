# SOLID Principles in Java

This project showcases the basic implementation of the SOLID principles in Java.

## Table of Contents

- [Introduction](#introduction)
- [SOLID Principles](#solid-principles)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  - [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  - [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  - [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project serves as a practical illustration of the SOLID principles, which aim to improve software design and reduce the risks of future changes. Each principle is demonstrated through simple classes and methods.

## SOLID Principles

### Single Responsibility Principle (SRP)
A class should have only one reason to change. The `Invoice` and `InvoicePrinter` classes illustrate SRP by separating the responsibility of invoice management and printing.

### Open/Closed Principle (OCP)
Software entities should be open for extension but closed for modification. The `Discount` class and its `PercentageDiscount` subclass exemplify this principle by allowing new discount types without altering existing code.

### Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. The `Rectangle` class demonstrates LSP by ensuring that derived classes maintain the behavior expected by their base class.

### Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use. The `SimplePrinter` class exemplifies ISP by providing a focused interface for printing.

### Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. The `Notification` class uses `MessageService` as an interface to achieve this principle, allowing easy swapping of notification methods.

## Getting Started

To run this project, ensure you have Java installed on your machine. Clone the repository and compile the Java files.

```bash
git clone https://github.com/yourusername/solid_principles_java.git
cd solid_principles_java
javac Main.java
