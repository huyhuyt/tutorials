import sys
import Employee

def main() -> int:
    employee1 = Employee.Employee("Kevin")
    employee1.show_name()
    return 0

if __name__ == '__main__':
    sys.exit(main())