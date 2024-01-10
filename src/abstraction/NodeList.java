package abstraction;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem listItem);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
