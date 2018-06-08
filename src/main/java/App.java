import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.Event;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient("teste",
                "root", "password");

        client.registerEventListener(new BinaryLogClient.EventListener() {
            @Override
            public void onEvent(Event event) {
                System.out.println(event.toString());
            }
        });
        client.connect();
    }
}