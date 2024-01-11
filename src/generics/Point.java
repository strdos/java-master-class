package generics;

import java.util.Arrays;

abstract class Point implements Mappable{

    private final double[] location;

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    private String location() {
        //String coordinates = String.valueOf(location[0]) + ", " + String.valueOf(location[1]);
        return Arrays.toString(location);
    }
    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT " + location());  //this here means the string representation of the class that's calling this method
    }
}
