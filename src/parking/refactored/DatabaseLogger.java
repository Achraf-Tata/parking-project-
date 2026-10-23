package parking.refactored;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String line) {
        System.out.println("[DATABASE LOG] " + line);
    }
}
