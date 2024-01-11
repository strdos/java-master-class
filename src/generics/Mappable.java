package generics;

public interface Mappable {
    void render();
    static double[] stringToLatLon(String s) {
        String[] splits = s.split(",");
        double[] coordinates = new double[splits.length];
        for (int i = 0; i < splits.length; i++) {
            coordinates[i] = Double.parseDouble(splits[i]);
        }
        return coordinates;
    }
}
