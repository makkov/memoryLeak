import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LeakMemory {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        Thread.sleep(3000);
        String str = "";
        long i = 1;
        while (true) {
            int num = random.nextInt(10);
            str += num;
            list.add(str);
            System.out.println(str);
            i++;
            if (i % 2 == 0) {
                list.remove(list.size() - 1);
            }
        }
    }

}
