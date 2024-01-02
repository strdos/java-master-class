package linkedLists;

import java.util.LinkedList;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s -> %d", name, distance);
    }
}

public class Itinerary {
    public static void main(String[] args) {

        Place adelaide = new Place("Adelaide", 1374);
        Place aliceSprings = new Place("AliceSprings", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place perth = new Place("Perth", 3923);

        LinkedList<Place> places = new LinkedList<>();

        addPlace(places, adelaide);
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, darwin);
        addPlace(places, aliceSprings);
        addPlace(places, brisbane);
        addPlace(places, melbourne);
        addPlace(places, perth);
        places.addFirst(new Place("Sydney", 0));
        System.out.println(places);
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
/*        if (list.contains(place)) {
            System.out.println(place.name() + " is already in the list.");
            return;
        } else {
            list.add(place);
        }*/
        for (Place p: list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println(place.name() + " is already in the list.");
                return;
            }
        }
        for (Place p: list) {
            if (place.distance() < p.distance()) {
                list.add(list.indexOf(p), place);
                return;
            }
        }
        list.add(place);
    }
}
