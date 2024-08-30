// Main.java
public class Main {
    public static void main(String[] args) {
        Television tv = new Television();

        // Using Digital Tuning and HD Display
        tv.setTuningStrategy(new DigitalTuningStrategy());
        tv.setDisplayStrategy(new HDDisplayStrategy());
        tv.tune(5);
        tv.display("Nature Documentary");

        // Switching to Analog Tuning and SD Display
        tv.setTuningStrategy(new AnalogTuningStrategy());
        tv.setDisplayStrategy(new SDDisplayStrategy());
        tv.tune(12);
        tv.display("Classic Movie");
    }
}
