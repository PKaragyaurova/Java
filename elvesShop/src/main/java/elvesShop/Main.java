package elvesShop;

import elvesShop.core.Engine;
import elvesShop.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
