import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchService {

    private List<Shop> shops = new ArrayList<>();

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    // ========= 1) Мінімальна ціна (типізований for-each) =========
    public double findMinPrice(Product target) {
        double min = Double.MAX_VALUE;

        for (Shop shop : shops) {  // типізований for-each
            Double price = shop.getPrice(target);
            if (price != null && price < min) {
                min = price;
            }
        }
        return min == Double.MAX_VALUE ? -1 : min;
    }

    // ========= 2) Магазини з мінімальною ціною (нетипізований ітератор) =========
    public List<Shop> findShopsWithMinPrice(Product target) {
        double min = findMinPrice(target);
        List<Shop> result = new ArrayList<>();

        Iterator it = shops.iterator(); // нетипізований ітератор
        while (it.hasNext()) {
            Shop shop = (Shop) it.next();
            Double price = shop.getPrice(target);
            if (price != null && price == min) {
                result.add(shop);
            }
        }

        return result;
    }

    // ========= 3) Магазини, де ВСІ товари дешевші за RRP (типізований ітератор) =========
    public List<Shop> shopsCheaperThanRecommended() {
        List<Shop> result = new ArrayList<>();

        for (Shop shop : shops) {
            boolean allCheaper = true;

            Iterator<StoreItem> it = shop.getItems().iterator(); // типізований ітератор

            while (it.hasNext()) {
                StoreItem item = it.next();
                Product p = item.getProduct();
                double price = item.getPrice();

                if (price >= p.getRecommendedPrice()) {
                    allCheaper = false;
                    break;
                }
            }

            if (allCheaper) {
                result.add(shop);
            }
        }

        return result;
    }
}