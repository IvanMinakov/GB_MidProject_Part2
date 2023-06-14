import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    public static class Toy {
        private int id;
        private String name;
        private int quantity;
        private int weight;

        public Toy(int id, String name, int quantity, int weight) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.weight = weight;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getWeight() {
            return weight;
        }
    }

    private List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getRandomToy() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalWeight);

        int weightSum = 0;
        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (randomNumber < weightSum) {
                return toy;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new Toy(1, "Мяч", 10, 20));
        toyStore.addToy(new Toy(2, "Кукла", 5, 30));
        toyStore.addToy(new Toy(3, "Конструктор", 8, 50));
        toyStore.addToy(new Toy(4, "Машинка", 15, 40));
        toyStore.addToy(new Toy(5, "Плюшевый медведь", 12, 25));
        toyStore.addToy(new Toy(6, "Книжка", 20, 15));
        toyStore.addToy(new Toy(7, "Пазл", 7, 35));
        toyStore.addToy(new Toy(8, "Кубики", 10, 30));
        toyStore.addToy(new Toy(9, "Кукольный домик", 3, 45));
        toyStore.addToy(new Toy(10, "Футбольный мяч", 6, 20));

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
