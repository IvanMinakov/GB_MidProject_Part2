public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new ToyStore.Toy(1, "Мяч", 10, 20));
        toyStore.addToy(new ToyStore.Toy(2, "Кукла", 5, 30));
        toyStore.addToy(new ToyStore.Toy(3, "Конструктор", 8, 50));
        toyStore.addToy(new ToyStore.Toy(4, "Машинка", 15, 40));
        toyStore.addToy(new ToyStore.Toy(5, "Плюшевый медведь", 12, 25));
        toyStore.addToy(new ToyStore.Toy(6, "Книжка", 20, 15));
        toyStore.addToy(new ToyStore.Toy(7, "Пазл", 7, 35));
        toyStore.addToy(new ToyStore.Toy(8, "Кубики", 10, 30));
        toyStore.addToy(new ToyStore.Toy(9, "Кукольный домик", 3, 45));
        toyStore.addToy(new ToyStore.Toy(10, "Футбольный мяч", 6, 20));

        ToyStore.Toy randomToy = toyStore.getRandomToy();
        if (randomToy != null) {
            System.out.println("Поздравляем, вы выиграли игрушку:");
            System.out.println("ID: " + randomToy.getId());
            System.out.println("Название: " + randomToy.getName());
        } else {
            System.out.println("Игрушки закончились :(");
        }
    }
}