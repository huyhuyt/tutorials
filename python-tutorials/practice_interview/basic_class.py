class Student:
    def add_student(self,first:str, last:str):
        self.first = first
        self.last = last
        a = 3
        b =4
    def print_student_info(self):
        full_name = self.first + self.last
        s = "hello "
        greeting = s + full_name
        return greeting

s1 = Student()
s1.add_student("kevin ", "nguyen")
res = s1.print_student_info()
print(res)