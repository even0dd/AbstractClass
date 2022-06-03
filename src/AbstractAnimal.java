abstract public class AbstractAnimal {
    protected double weight;
    protected int age;
    protected String color;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak(){
        System.out.println("something");
    }
    abstract void sleep();
    abstract void eat();

    @Override
    public String toString() {
        return "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' ;
    }
}
