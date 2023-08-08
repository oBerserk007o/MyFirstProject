import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\text.txt");
        int data = reader.read();
        int count = 1;
        while (data != -1) {
            if (data == 32 || data == 10) {
                count++;
            }
            data = reader.read();
        }
        System.out.println("Number of words:" + count);
    }
}
