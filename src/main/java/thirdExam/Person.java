package thirdExam;

public abstract class Person implements ISize{
    private String name;
private ISize size;

    public Person(String name, ISize size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public ISize getSize() {
        return size;
    }

    public void printInfo(){
        System.out.println("Name: " + getName() + "\n Size: " + getSize());
    }
}
