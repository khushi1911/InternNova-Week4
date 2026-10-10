# Java Exception Handling & Collections

A collection of Java programs demonstrating exception handling, collection frameworks, and string manipulation, developed as part of the InternNova Java Development.

## Overview

This project explores essential Java programming concepts through practical implementations, progressing from individual programs to a menu-driven Student Record Manager.

The programs demonstrate error handling, collection operations, key-value data storage, unique element management, and mutable string manipulation.

## Tech Stack

* **Language:** Java
* **JDK:** 26
* **IDE:** Visual Studio Code
* **Version Control:** Git & GitHub

## Projects

### 01. Safe Calculator

A console-based calculator that performs basic arithmetic operations with exception handling.

**Features**

* Addition, subtraction, multiplication, division, and modulus
* Handles division and modulus by zero
* Handles invalid numeric input
* Supports repeated calculations

**Concepts:** Exception Handling, Scanner, Switch Statements

### 02. Student Names Manager

A program for managing a collection of student names.

**Features**

* Add and display student names
* Remove a student
* Search for a student
* Display the updated collection

**Concepts:** ArrayList, Collection Operations

### 03. Unique Course Manager

A program that maintains a collection of unique course names.

**Features**

* Add multiple course entries
* Automatically eliminate duplicate values
* Search for a course
* Display unique courses

**Concepts:** HashSet, Uniqueness, Set Operations

### 04. Student Records

A program that stores and manages student IDs and corresponding names.

**Features**

* Add student records
* Display all records
* Search using a student ID
* Remove records
* Display updated records

**Concepts:** HashMap, Key-Value Pairs, Map Operations

### 05. String Manipulation

A demonstration of mutable string operations using Java's StringBuilder class.

**Features**

* Append additional text
* Insert text at a specified position
* Replace a portion of the text
* Reverse the final string

**Concepts:** StringBuilder, Mutable Strings

### 06. Student Record Manager

A menu-driven console application that brings together the concepts explored throughout the project.

**Features**

* Add student details, including ID, name, course, and age
* View all stored student records
* Search for students using their IDs
* Remove student records
* Display unique courses across student records
* Validate student details and handle common input errors
* Format student information using StringBuilder

**Concepts:** HashMap, HashSet, Collections, Exception Handling, StringBuilder

Student records are maintained in memory during execution and are not persisted after the application exits.

## Project Structure

```text
InternNova-Week4/
│
├── Task1_SafeCalculator.java
├── Task2_StudentNames.java
├── Task3_UniqueCourses.java
├── Task4_StudentRecords.java
├── Task5_StringBuilderDemo.java
├── Task6_StudentRecordManager.java
├── Screenshots/
└── README.md
```

## Getting Started

### Prerequisites

* Java Development Kit (JDK) installed
* A terminal or Java-compatible IDE
* Git (optional, for cloning the repository)

### Clone the Repository

```bash
git clone <your-repository-url>
cd InternNova-Week4-Exception-Collections
```

Replace `<your-repository-url>` with your actual GitHub repository URL.

### Compile and Run

Each program can be compiled and executed independently.

For example, to run the Student Record Manager:

```bash
javac Task6_StudentRecordManager.java
java Task6_StudentRecordManager
```

To run another program, replace `Ta

## Task Explanations

### Task 1: Safe Calculator

The Safe Calculator performs addition, subtraction, multiplication, division, and modulus operations. It uses a `switch` statement to select operations and exception handling to manage division by zero and invalid numeric input. The program continues running after handling errors.

**Concepts Used:** `Scanner`, `switch`, `try-catch`, `ArithmeticException`, `InputMismatchException`.

### Task 2: Student Names Manager

This program uses an `ArrayList` to store and manage student names. It displays the names, removes a specified name, searches for a student, and displays the updated collection.

**Concepts Used:** `ArrayList`, adding and removing elements, searching, and iteration.

### Task 3: Unique Courses

This program uses a `HashSet` to store course names while automatically preventing duplicate entries. It displays the unique courses, counts the distinct entries, and checks whether a particular course exists.

**Concepts Used:** `HashSet`, duplicate prevention, and searching.

### Task 4: Student Records

This program stores student IDs as keys and student names as values in a `HashMap`. It displays all records, searches for a student by ID, and removes a selected record.

**Concepts Used:** `HashMap`, key-value pairs, searching, and removing entries.

### Task 5: StringBuilder Demonstration

This program demonstrates string manipulation using `StringBuilder`. It appends text, inserts content at a specified position, replaces part of the text, and reverses the resulting string.

**Concepts Used:** `StringBuilder`, `append()`, `insert()`, `replace()`, and `reverse()`.

### Task 6: Student Record Manager

This menu-driven application manages student records containing an ID, name, course, and age. It supports adding, viewing, searching, and removing students, as well as displaying unique courses. A `HashMap` stores student records, a `HashSet` identifies unique courses, and `StringBuilder` formats student details. Exception handling manages invalid menu choices and other supported input errors.

**Concepts Used:** Classes and objects, `HashMap`, `HashSet`, `StringBuilder`, menu-driven programming, and exception handling.

