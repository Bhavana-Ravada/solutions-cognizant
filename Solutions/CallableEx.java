import java.util.concurrent.*;
import java.util.*;

public class CallableEx {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            final int id = i;
            tasks.add(() -> "Task " + id + " result");
        }
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }
        executor.shutdown();
    }
}
