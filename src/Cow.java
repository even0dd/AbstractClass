public class Cow extends AbstractAnimal{

    public Cow(double weight, int age, String color) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }
    @Override
    public void speak(){
        System.out.println("MU");
    }

    @Override
    void sleep() {
        System.out.println("sleeping");
    }

    @Override
    void eat() {
        System.out.println("eating");

    }
    @Override
    public String toString() {
        return "weight =" + weight +
                ", age =" + age +
                ", color ='" + color + '\'';
    }

}
