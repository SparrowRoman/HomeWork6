package HomeWork7;

public class Cat {
    String name;
    private int appetite;
    private int satisfied;

    public Cat(String name, int appetite, int satisfied) {
        this.name = name;
        this.appetite = appetite;
        this.satisfied = satisfied;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void setSatisfied(Plate x) {
        if (x.getFood() >= appetite) {
            this.satisfied = satisfied + appetite;
            System.out.println(name + "   satisfied " + satisfied);
        } else {
            System.out.println(name + " не досталась пища ");
        }
        // this.satisfied = satisfied+ appetite;

    }


}/*Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/
