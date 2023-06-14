public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(toyStore.new Toy(1, "Мяч", 10, 20));
        toyStore.addToy(toyStore.new Toy(2, "Кукла", 5, 30));
        toyStore.addToy(toyStore.new Toy(3, "Конструктор", 8, 50));
        toyStore.addToy(toyStore.new Toy(4, "Машинка", 15, 40));
        toyStore.addToy(toyStore.new Toy(5, "Плюшевый медведь", 12, 25));
        toyStore.addToy(toyStore.new Toy(6, "Книжка", 20, 15));
        toyStore.addToy(toyStore.new Toy(7, "Пазл", 7, 35));
        toyStore.addToy(toyStore.new Toy(8, "Кубики", 10, 30));
        toyStore.addToy(toyStore.new Toy(9, "Кукольный домик", 3, 45));
        toyStore.addToy(toyStore.new Toy(10, "Футбольный мяч", 6, 20));

        ToyStore.Toy randomToy = toyStore.getRandomToy();
        if (randomToy != null) {
            System.out.println("Поздравляем, вы выиграли игрушку:");
            System.out.println("ID: " + randomToy.toy.getId());
            System.out.println("Название: " + randomToy.toy.getName());
        } else {
            System.out.println("Игрушки закончились :(");
        }
    }
}
