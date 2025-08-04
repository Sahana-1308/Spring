# Spring IoC - Object Creation using Annotations

This project demonstrates how **Spring Framework** automatically creates objects using annotations like `@Component`, `@ComponentScan`, and `@Configuration`.

## 🧠 What This Project Shows

- How Spring creates objects without using `new`.
- Using `@Component` to mark classes for automatic object creation.
- Using `@ComponentScan` to tell Spring where to search for classes.
- Basic configuration using `@Configuration`.

## 📁 Files in This Project

- **App.java** → Main class where Spring is initialized.
- **AppConfig.java** → Configuration class with `@ComponentScan`.
- **Student.java**,**Employee.java** and **Animal.java** → Classes with `@Component` annotation.

## 🔧 How It Works

- Spring scans the base package mentioned in `AppConfig.java`.
- It finds classes with `@Component` and creates objects for them.
- You don’t need to write `new` – Spring does it for you.
- Run the `App.java` file to see the output (e.g.,"Student Object Created" "Animal Object Created" "Employee Object Created").

## ▶️ How to Run

1. Clone the repo.
2. Open in your IDE (Eclipse, IntelliJ, etc.).
3. Run `App.java` class.
4. Output will show object creation by Spring.

## 📌 Tools Used

- Java
- Spring Core (IoC)
- Maven
