import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<StoreItem> items = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void addProduct(Product product, double price) {
        items.add(new StoreItem(product, price));
    }

    public String getName() {
        return name;
    }

    public List<StoreItem> getItems() {
        return items;
    }

    // Пошук ціни товару в цьому магазині
    public Double getPrice(Product target) {
        for (StoreItem item : items) {
            if (item.getProduct().getName().equals(target.getName())) {
                return item.getPrice();
            }
        }
        return null;
    }
}