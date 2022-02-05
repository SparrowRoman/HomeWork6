package HomeWork6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", 80, 0, 200, 0);
        Dog dog = new Dog("Тузик", 200, 7, 500, 10);


        cat.runAnimals();
        System.out.println(cat.trueRunCat());
        cat.runAnimals();
        System.out.println(cat.trueRunCat());
        cat.runAnimals();
        System.out.println(cat.trueRunCat());
        cat.swimmingAnimals();
        System.out.println(cat.trueSwimmingCat());

        dog.runAnimals();
        System.out.println(dog.trueRunDog());
        dog.runAnimals();
        System.out.println(dog.trueRunDog());
        dog.runAnimals();
        System.out.println(dog.trueRunDog());

        dog.swimmingAnimals();
        System.out.println(dog.trueSwimmingDog());
        dog.swimmingAnimals();
        System.out.println(dog.trueSwimmingDog());

    }
    }


/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому
методу передается длина препятствия. Результатом выполнения действия
будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/