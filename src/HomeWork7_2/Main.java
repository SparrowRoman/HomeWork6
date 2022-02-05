package HomeWork7_2;

public class Main {


    public static void main(String[] args) {

        Plate plate = new Plate(15);

        Cat[] array = new Cat[]{new Cat("Барсик", 10), new Cat("Тишка", 10)};

        for (Cat cat : array) {
            System.out.println(cat.printSatisfeid());
        }
        System.out.println(plate);


        for (Cat cat : array) {
            cat.eat(plate);
            System.out.println(cat.printSatisfeid());
        }
        System.out.println(plate);

     for (Cat cat : array) {
            cat.eat(plate);
            System.out.println(cat.printSatisfeid());
        }
        System.out.println(plate);
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