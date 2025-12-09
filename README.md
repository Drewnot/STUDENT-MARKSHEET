Student Marksheet Generator (Java)

This project is a Java program designed to manage and calculate student marks and generate a structured marksheet directly in the terminal.


Features and Functionality

The program performs the following core functions:

1.  User Input Collection: Prompts the user to enter essential data:
    * School details (Name, Address).
    * Teacher/Instructor details.
    * Class/Grade details (e.g., Grade 10-A).
    * Score Records: Collects score records for 15 individual students.

2.  Data Storage: Stores all collected inputs, including details and marks, using appropriate data structures like arrays and standard variable storage locations.

3.  Calculations & Grading:
    * Calculates the total marks for each student.
    * Determines the corresponding grade (A, B, C, D, F) for each student using an `if-else-if` conditional statement block.

4.  Statistical Analysis:
    * Calculates and displays the count of each grade awarded (e.g., Number of A's, B's, etc.).
    * Calculates the "total marks" and average score for each subject across all students.

5.  Output Display: Displays all the stored inputs, calculated totals, averages, and grades in a highly **structured, formatted sheet** directly in the terminal.

---

 Technical Implementation Details

The program leverages fundamental Java concepts to achieve its goals:

| Concept | Usage |
| :--- | :--- |
| Input Handling | Uses `input.nextLine()` (or similar `Scanner` methods) to safely capture and store user inputs into predefined storage locations. |
| Iteration (Data Collection) | Employs a `for` loop to efficiently iterate and collect the details and scores for each of the 15 students. |
| Data Structure | Utilizes Arrays to store multiple entries of student details and scores as the iteration of the collection loop continues. |
| Grading Logic | Implements an `if-else-if` ladder for comprehensive conditional logic to assign the final grade to each student based on their total marks. |
| Iteration (Display) | A separate `for` loop is used to iterate through the stored data and display the complete marksheet in a defined and readable terminal format. |

