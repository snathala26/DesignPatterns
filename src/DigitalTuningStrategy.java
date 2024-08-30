// DigitalTuningStrategy.java
public class DigitalTuningStrategy implements ChannelTuningStrategy {
    @Override
    public void tuneChannel(int channelNumber) {
        System.out.println("Tuning to digital channel " + channelNumber);
    }
}
