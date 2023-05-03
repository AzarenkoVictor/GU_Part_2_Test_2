import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        ToyList<Toy> toys = new ToyList<>();
        Queue<Toy> queue = new PriorityQueue<>(Collections.reverseOrder());
        File save = new File();
        Droprate random = new Droprate();
        Toy toy1 = new Toy(1, "Конструктор", 2, random.rnd());
        Toy toy2 = new Toy(2, "Кукла", 3, random.rnd());
        Toy toy3 = new Toy(3, "Робот", 2, random.rnd());
        Toy toy4 = new Toy(3, "Машинка", 2, random.rnd());
        toys.addToy(toy1);
        toys.addToy(toy2);
        toys.addToy(toy3);
        toys.addToy(toy4);
        System.out.println("Список игрушек в наличии: \n" + toys.print());
        toys.sortByDroprate();
        System.out.println("Итоговый список: \n" + toys.print());
        for (Toy toy : toys) {
            queue.add(toy);
        }
        save.fileSaving(queue);
    }
}