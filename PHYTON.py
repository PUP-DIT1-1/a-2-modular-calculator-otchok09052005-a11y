def add_student():
    name = input("Enter student name: ")
    grade = input("Enter grade: ")

    with open("students.txt", "a") as file:
        file.write(name + "," + grade + "\n")

    print("Record saved successfully!\n")


def view_students():
    try:
        with open("students.txt", "r") as file:
            print("\nStudent Records:")
            for line in file:
                name, grade = line.strip().split(",")
                print("Name:", name, "| Grade:", grade)
    except FileNotFoundError:
        print("No records found.\n")


def main():
    while True:
        print("\n1. Add Student")
        print("2. View Students")
        print("3. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            add_student()
        elif choice == "2":
            view_students()
        elif choice == "3":
            print("Program ended.")
            break
        else:
            print("Invalid choice. Try again.")

main()