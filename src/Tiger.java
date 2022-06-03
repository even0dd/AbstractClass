public class Tiger extends AbstractCats{
    public Tiger(int amountOfClaws, double heightOfTail, double heightOfWhiskers) {
        this.amountOfClaws = amountOfClaws;
        this.heightOfTail = heightOfTail;
        this.heightOfWhiskers = heightOfWhiskers;
    }
    @Override
    public void speak(){
        System.out.println("roar");
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
    void meow() {
        System.out.println("roars");

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
