package HomeWork6;

public class Dog extends Animals {
    public Dog(String name, int run, int swimming, int limitRun, int limitSwimming) {
        super(name, run, swimming, limitRun, limitSwimming);
    }
    @Override
    public void runAnimals() {
        limitRun -= run;
        System.out.println("Собака по кличке  " + name + " пробежала " + run + " метров");
    }
    public boolean trueRunDog() {
        return limitRun > 0;
    }

    @Override
    public void swimmingAnimals() {
        limitSwimming -=swimming;
        System.out.println("Собака по кличке  " + name + " проплыл " + swimming + " метров");
    }
    public boolean trueSwimmingDog(){
        return limitSwimming >0;
    }
}


