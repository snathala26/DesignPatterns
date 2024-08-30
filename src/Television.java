// Television.java
public class Television {
    private ChannelTuningStrategy tuningStrategy;
    private DisplayStrategy displayStrategy;

    public void setTuningStrategy(ChannelTuningStrategy tuningStrategy) {
        this.tuningStrategy = tuningStrategy;
    }

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void tune(int channelNumber) {
        if (tuningStrategy == null) {
            throw new IllegalStateException("Tuning strategy not set");
        }
        tuningStrategy.tuneChannel(channelNumber);
    }

    public void display(String content) {
        if (displayStrategy == null) {
            throw new IllegalStateException("Display strategy not set");
        }
        displayStrategy.displayContent(content);
    }
}
