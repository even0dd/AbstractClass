abstract public class AbstractCats extends AbstractAnimal {
    protected int amountOfClaws;
    protected double heightOfTail;
    protected double heightOfWhiskers;

    public void setAmountOfClaws(int amountOfClaws) {
        this.amountOfClaws = amountOfClaws;
    }

    public void setHeightOfTail(double heightOfTail) {
        this.heightOfTail = heightOfTail;
    }

    public void setHeightOfWhiskers(double heightOfWhiskers) {
        this.heightOfWhiskers = heightOfWhiskers;
    }

    @Override
    public void speak(){
        System.out.println("meow");
    }
    abstract void eat();
    abstract void meow();
    abstract void sharpen();
    abstract void land();

    @Override
    public String toString() {
        return "AbstractCats{" +
                "amountOfClaws=" + amountOfClaws +
                ", heightOfTail=" + heightOfTail +
                ", heightOfWhiskers=" + heightOfWhiskers +
                '}';
    }
}
