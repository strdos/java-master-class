package nested_classes;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        //return super.toString();
        //return title + " : " + duration;
        //return String.format("%s: %.2f", title, duration);
        return String.format("%s: %s", title, Double.toString(duration));
    }
}
