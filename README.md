# 📝 Java ToDo List Console App

This is a simple command-line based ToDo List application written in Java. It allows you to manage your daily tasks with basic features like adding, viewing, and completing tasks. The tasks are saved to a local text file so that they persist even after you close the app.

---

## ✅ Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- Save tasks to a file (`tasks.txt`)
- Load tasks from file at startup

---

## 🛠️ Technologies Used

- Java Core (OOP, File I/O)
- Collections (ArrayList)
- Console UI

---

## 📂 File Structure

├── Task.java # Model class for a single task
├── TaskManager.java # Handles task logic and file operations
├── Main.java # Entry point and console UI
├── README.md # Project documentation

yaml
Copy
Edit

---

## 🧪 How to Run

### 💻 Compile:
```bash
javac *.java
▶️ Run:
bash
Copy
Edit
java Main
Make sure you have Java installed and your terminal is in the project directory.

📌 Example Output:
mathematica
Copy
Edit
ToDo List Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
4. Exit
Choose option: 1
Enter task title: Submit Java assignment
