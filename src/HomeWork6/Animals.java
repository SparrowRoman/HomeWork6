package HomeWork6;

public abstract class Animals {
    protected String name;
    protected int run;
    protected int swimming;
    protected int limitRun;
    protected int limitSwimming;

    public abstract void runAnimals();
    public abstract void swimmingAnimals();

    public Animals(String name,
                   int run,
                   int swimming,
                   int limitRun,
                   int limitSwimming) {
        this.name = name;
        this.run = run;
        this.swimming = swimming;
        this.limitRun = limitRun;
        this.limitSwimming = limitSwimming;
    }
}



