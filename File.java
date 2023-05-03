import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class File {
    public void fileSaving(Queue<Toy> queue) {
        try (FileWriter writer = new FileWriter("File.txt", false)) {
            while (!queue.isEmpty()) {
                writer.append(String.format("%s  ", queue.peek()));
                writer.append("\n");
                queue.poll();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}