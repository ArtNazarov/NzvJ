/* Author: Nazarov A.A., 2025, Orenburg */
/* Package simplifies writing Java console apps */
package NzvJ;

import java.util.HashMap;
import java.util.function.Consumer;

public class NzvApp {
    private final HashMap<String, Consumer<String>> commands = new HashMap<>();

    // Изменяем возвращаемый тип на NzvApp
    public NzvApp onCommand(String path, Consumer<String> handler) {
        commands.put(path, handler);
        return this; // Возвращаем текущий объект
    }

    public NzvApp process(String command, String params) {
        if (commands.containsKey(command)) {
            commands.get(command).accept(params);
        }
        return this;
    }
}
