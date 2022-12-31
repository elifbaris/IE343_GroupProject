import java.util.Arrays;

public class Track {
    public int trackID;
    public int trackDuration;
    public int track_individual_value;
    public double[] track_sequential_value;


    public Track(int trackID, int trackDuration, int track_individual_value) {
        this.trackID = trackID;
        this.trackDuration = trackDuration;
        this.track_individual_value = track_individual_value;
    }

    public int getId() {
        return trackID;
    }

    public void setId(int trackID) {
        this.trackID = trackID;
    }

    public int getDuration() {
        return trackDuration;
    }

    public void setDuration(int trackDuration) {
        this.trackDuration = trackDuration;
    }

    public int getIndividualValue() {
        return track_individual_value;
    }

    public void setIndividualValue(int track_individual_value) {
        this.track_individual_value = track_individual_value;
    }

    public double[] getSequentialValue() {
        return track_sequential_value;
    }

    public void setSequentialValue(double[] track_sequential_value) {
        this.track_sequential_value = track_sequential_value;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackID=" + trackID +
                ", trackDuration=" + trackDuration +
                ", track_individual_value=" + track_individual_value +
                ", track_sequential_value=" + Arrays.toString(track_sequential_value) +
                '}';
    }
}