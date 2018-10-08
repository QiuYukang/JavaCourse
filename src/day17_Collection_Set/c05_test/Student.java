package day17_Collection_Set.c05_test;

public class Student implements Comparable<Student>{
    private String Name;
    private int ChineseGrade;
    private int MathGrade;
    private int EnglishGrade;
    private int sumGrade;

    public Student(String name, int chineseGrade, int mathGrade, int englishGrade) {
        Name = name;
        ChineseGrade = chineseGrade;
        MathGrade = mathGrade;
        EnglishGrade = englishGrade;
        sumGrade = ChineseGrade + MathGrade + EnglishGrade;
    }

    public String getName() {
        return Name;
    }

    public int getChineseGrade() {
        return ChineseGrade;
    }

    public int getMathGrade() {
        return MathGrade;
    }

    public int getEnglishGrade() {
        return EnglishGrade;
    }

    public int getSumGrade() {
        return sumGrade;
    }

    @Override
    public int compareTo(Student s) {
        int num = this.sumGrade - s.sumGrade;
        int num2 = num == 0 ? Name.compareTo(s.Name): num;
        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", sumGrade=" + sumGrade +
                '}';
    }
}
