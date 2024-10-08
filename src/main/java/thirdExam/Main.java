package thirdExam;

public class Main {

    public static void main(String[] args) {
Cloth[] shoppingBag = new Cloth[3];
        shoppingBag[0] = new Cloth("Jeans",20.0,Size.S);
        shoppingBag[1] = new Cloth("T-Shirt",8.0,Size.M);
        shoppingBag[2] = new Cloth("Hat",2.0,Size.L);

        UtilityMethods.calculateSubtotal(shoppingBag);

        Student student1 = new Student("Mike",Size.L,shoppingBag);
        Student student2 = new Student("Jane",Size.S,shoppingBag);

       Student[] listOfStudents= {student1,student2};
        for(Student student: listOfStudents){
         student.printInfo();
        }

        System.out.println("Number of students:"); Student.printStudentsCounter();

//HourlyEmployee employee1 = new HourlyEmployee("Alex",Size.S,)
    }

}
