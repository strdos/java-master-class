package composition;

public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Refrigerator() {
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("ordering food...");
            hasWorkToDo = false;
        }
    }
}
