package HomeWork7_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satisfied = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }


    public void eat(Plate p) {
        if (!satisfied && p.decreaseFood(appetite)) ;
       satisfied = true;

    }

    public String printSatisfeid() {
        if (satisfied) {
            return name + "  сыт";
        } else {
            return name + "  глоден";
        }
    }
}


/*Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).

Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.

Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
информацию о сытости котов в консоль.

Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/
