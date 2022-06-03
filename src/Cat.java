public class Cat extends AbstractCats{

    public Cat(int amountOfClaws, double heightOfTail, double heightOfWhiskers) {
        this.amountOfClaws = amountOfClaws;
        this.heightOfTail = heightOfTail;
        this.heightOfWhiskers = heightOfWhiskers;

    }

    @Override
    public void speak(){
        System.out.println("meow");
    }

    @Override
    void sleep() {
        System.out.println("sleeping");
    }

    @Override
    void eat() {
        System.out.println("eating ");

    }


    @Override
    void meow() {
        System.out.println("meowing");

    }

    @Override
    void sharpen() {
        System.out.println("sharpens");

    }

    @Override
    void land() {
        System.out.println("landing on feets");

    }
    @Override
    public String toString() {
        return
                "amountOfClaws = " + amountOfClaws +
                ", heightOfTail = " + heightOfTail +
                ", heightOfWhiskers = " + heightOfWhiskers+
                        ", weight = " + weight +
                        ", age = " + age +
                        ", color = " + color + '\'' ;
    }
}
