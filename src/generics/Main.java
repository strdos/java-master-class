package generics;

public class Main {

    public static void main(String[] args) {

        var nationalParks = new Park[] {
                new Park("Yellowstone", "44.48, -110.59"),
                new Park("Grand Canyon", "36.10, -112.10")
        };

        Layer<Park> parkLayer = new Layer<>(nationalParks);
        parkLayer.addElements(new Park("Zion", "37.31, -113.02"));
        parkLayer.renderLayer();


        var rivers = new River[] {
            new River("Mississippi", "47.21, -95.23", "29.16, -89.24", "35.15, -90.06"),
            new River("Missouri", "45.92, -111.50", "38.81, -90.12")
        };

        Layer<River> riverLayer = new Layer<>(rivers);
        riverLayer.addElements(new River("Colorado", "40.47, -105.83", "31.78, -114.77"));
        riverLayer.renderLayer();

    }
}
