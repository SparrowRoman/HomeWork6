package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return  food;
    }
    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void info() {
        if (food >= 0) {
            System.out.println("Food amount:  " + food);
        } else {
            System.out.println("Сat is hungry ");
        }
    }



}
