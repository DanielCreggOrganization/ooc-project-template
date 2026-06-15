# OOC Project - <Your Application Title>

> A **console**, array-based Java application that manages custom objects and demonstrates the **four pillars of OOP**.

**Title:** Items Application Manager
**Name:** Patrick Murphy
**Student ID:** G00123456

> ℹ️ The title, name and ID above are **placeholders** - replace them with your own details.

## Open in Codespaces

This project is built to run in **GitHub Codespaces** (Java 21 is pre-installed - nothing to install locally).

1. On your repository, click **`< > Code` → Codespaces → Create codespace on `main`**.
2. When VS Code opens, open `src/ie/atu/testpackage/Main.java`.
3. Press **Run** (or use the terminal commands in [Running the Application](#running-the-application)).

The menu runs from day one; you then complete the `TODO`s in the source files.

## Application Function

Describe what your application does. What kind of object does it manage, and what can the user do with it from the menu (add, remove, update, find total, search)?

## The Four Pillars of OOP

Explain briefly where each pillar appears in **your** code:

- **Encapsulation** - e.g. the fields of `MyObject` are `private` and accessed only through getters/setters.
- **Inheritance** - e.g. a subclass that extends your object.
- **Polymorphism** - e.g. overriding `toString()` (and/or methods in a subclass).
- **Abstraction** - e.g. `MyObjectManager` hides the array details behind simple methods.

## Running the Application

This is a **console** application. From the repository root:

```bash
# 1. Compile all classes into a 'bin' folder
javac -d bin src/ie/atu/testpackage/*.java

# 2. Run the program
java -cp bin ie.atu.testpackage.Main
```

Then use the on-screen menu:

```
1. Add Item
2. Remove Item
3. Update Item
4. Find Total Items
5. Search Items
6. Quit
```

*(In Codespaces you can also just open `Main.java` and click **Run**.)*

## Minimum Project Requirements

Describe how you have met all minimum project requirements:

- The repository contains, at minimum, two commits per week (in practice, many commits per day while coding).
- The project - code and documentation - is fully contained in this GitHub Classroom repository.
- A custom object with **4 instance variables of 4 different types**.
- The **4 pillars of OOP** are used.
- Menu features: **Add**, **Remove**, **Update**, **Find Total**, **Search** and **Quit**, backed by a **plain array**.
- The code **compiles** (Java 21).
- The code is formatted in a consistent, standard way.
- The code is commented - at minimum one Javadoc comment per class and method.
- The documentation and comments are free of spelling and grammar mistakes.

## Project Requirements Above and Beyond

Discuss any features or design elements that show you went beyond the basic requirements (extra methods, a chosen array size, an animated GIF, a runnable `.jar`, and so on).

## Application Architecture

Describe how the application is structured. List your classes and their purpose, and the key methods of each. As a starting point this template ships with:

- **`Main`** - the console menu (entry point and user interaction).
- **`MyObjectManager`** - the array-based store (`add`, `remove`, `update`, `getTotal`, `search`).
- **`MyObject`** - the custom object you manage (rename it to suit your project).

## Roadblocks and Unfinished Functionality

What did you not finish? Discuss the issues you faced, possible solutions, and what you would do differently next time.

## Resources

Provide links to resources you used, for example:

- [Tutorialspoint - Java](https://www.tutorialspoint.com/java/) - a Java tutorials site I found helpful.
