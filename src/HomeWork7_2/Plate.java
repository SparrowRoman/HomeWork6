package HomeWork7_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int amount) { // метод уменьшения еды -
        if (food - amount < 0) {
            System.out.println("Еда закончилась !"  + food + "еды");
            return false;
        } else {
            food -= amount;
            System.out.println("Коту хватило еды и осталось " + food + "еды");
            return true;
        }
    }
    @Override
    public String toString() {
        return "Plate{" + "food=" + food + '}';
    }

    // Метод addFood  - я так представляю добавление еды в тарелку поле того как будет не хватать еды Котам.
    public int addFood(Cat x){
        if(food < x.getAppetite()){
        }
        return food+20;
    }

}
