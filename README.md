# 🎓 Student Grade Calculator — Java Project 2

A console-based student grade calculator built in Java as part of the
DecodeLabs Industrial Training Kit (Batch 2026).

---

## 📌 Project Overview

The program takes marks for multiple subjects (out of 100), calculates
the total marks, computes the average percentage, and assigns a grade
based on the result. It is built on the Input-Process-Output (IPO)
model with strict input validation at every stage.

---

## ⚙️ Features

- 📚 Dynamic subject input — works for any number of subjects
- ✅ Marks validation — rejects values below 0 or above 100
- ➕ Total marks calculation
- 📊 Accurate percentage calculation using type casting
- 🎯 Grade assignment — A / B / C / D / F
- 🛡️ Input validation — handles non-numeric input without crashing
- 🔁 Re-prompts user on invalid input instead of terminating

---

## 🧠 Concepts Used

- `java.util.Scanner` — user input handling
- `java.util.InputMismatchException` — targeted exception handling
- `for` loop — accumulator pattern for subject marks
- `while` loop — subject count validation
- `if-else` ladder — grade classification logic
- `(double)` type casting — prevents integer division truncation
- `System.out.printf` with `%.2f` — formatted percentage output

---

## 📐 Grade Scale

| Percentage | Grade |
|------------|-------|
| 90% and above | A |
| 80% – 89% | B |
| 70% – 79% | C |
| 60% – 69% | D |
| Below 60% | F |

---

## 🚀 How to Run

### Prerequisites
- Java JDK installed (version 8 or above)

### Steps

1. Clone the repository
   git clone https://github.com/aaliantaqi/Task-2-AalianTaqi.git

2. Navigate to the project folder
   cd Task-2-AalianTaqi

3. Compile the file
   javac DecodeLabs_Java_P2.java

4. Run the program
   java DecodeLabs_Java_P2

---

## 🖥️ Sample Output

   How Many Subjects do you want to Enter: 3
   Enter the Marks of the 1 Subject (0-100): 85
   Enter the Marks of the 2 Subject (0-100): 90
   Enter the Marks of the 3 Subject (0-100): 78

   Total Subjects = 3
   Total Marks = 300
   Obtained Marks = 253
   Percentage = 84.33%
   Your Grade is B

---

## 📁 File Structure

   DecodeLabs_Java_P2.java   — Main source file

---

## 👨‍💻 Author

- **Aalian Taqi**
- DecodeLabs Industrial Training — Batch 2026

---

## 📄 License

This project is part of the DecodeLabs training program.
