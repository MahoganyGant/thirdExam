package thirdExam;

public class Student extends Customer{

    private long studentID;
    private static long studentsCounter;
    private final double DISCOUNT = 0.05;

    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        studentsCounter++;
        this.studentID = studentsCounter;
    }

    public long getStudentID() {
        return studentID;
    }

    public static long getStudentsCounter() {
        return studentsCounter;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public static void printStudentsCounter(){
        System.out.println(getStudentsCounter());
    }
}
