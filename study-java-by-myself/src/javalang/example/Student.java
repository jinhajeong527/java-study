package javalang.example;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student objStd = (Student) obj;
            return objStd.getStudentNum().equals(this.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}
