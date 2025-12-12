import java.util.HashSet;
import java.util.Set;

public class Shop {
    private String name;
    private Set<StoreItem> items = new HashSet<>();

    public Shop(String name) { this.name = name; }

    public void addProduct(Product product, double price) {
        items.add(new StoreItem(product, price));
    }

    public String getName() { return name; }

    public Set<StoreItem> getItems() { return items; }

    public Double getPrice(Product target) {
        for (StoreItem item : items) {
            if (item.getProduct().equals(target))
                return item.getPrice();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shop)) return false;
        return name.equals(((Shop) o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
