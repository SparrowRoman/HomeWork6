package HomeWork6;

public  class Cat extends Animals {
    public Cat(String name, int run, int swimming, int limitRun, int limitSwimming) {
        super(name, run, swimming, limitRun, limitSwimming);
    }
@Override
    public void runAnimals() {
        limitRun -= run;
        System.out.println("Кот по кличке  " + name + " пробежала " + run + " метров");
    }
    public boolean trueRunCat() {
        return limitRun > 0;
    }
@Override
    public void swimmingAnimals() {
        limitSwimming -= swimming;
        System.out.println("Кот по кличке  " + name + " проплыл  " + swimming + " метров");
    }
    public boolean trueSwimmingCat() {
        return limitSwimming > 0;
    }
}
