// AnalogTuningStrategy.java
public class AnalogTuningStrategy implements ChannelTuningStrategy {
    @Override
    public void tuneChannel(int channelNumber) {
        System.out.println("Tuning to analog channel " + channelNumber);
    }
}
