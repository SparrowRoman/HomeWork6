package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 6,0);
        Cat cat2 = new Cat("Tim", 5,0);
        Cat cat3 = new Cat("Sam", 3,0);
        Plate plate = new Plate(29);

        plate.info();

        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat1.setSatisfied(plate);
        cat2.setSatisfied(plate);
        cat3.setSatisfied(plate);

        plate.info();

        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat1.setSatisfied(plate);
        cat2.setSatisfied(plate);
        cat3.setSatisfied(plate);

        plate.info();
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