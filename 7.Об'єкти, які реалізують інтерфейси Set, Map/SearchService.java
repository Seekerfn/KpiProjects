import java.util.*;

public class SearchService {

    private Set<Shop> shops = new HashSet<>();

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    // 1) Типізований for-each
    public double findMinPrice(Product target) {
        double min = Double.MAX_VALUE;

        for (Shop shop : shops) {
            Double price = shop.getPrice(target);
            if (price != null && price < min)
                min = price;
        }
        return min == Double.MAX_VALUE ? -1 : min;
    }

    // 2) Нетипізований iterator
    public Set<Shop> findShopsWithMinPrice(Product target) {
        double min = findMinPrice(target);
        Set<Shop> result = new HashSet<>();

        Iterator it = shops.iterator();
        while (it.hasNext()) {
            Shop shop = (Shop) it.next();
            Double price = shop.getPrice(target);
            if (price != null && price == min)
                result.add(shop);
        }
        return result;
    }

    // 3) Типізований iterator
    public Set<Shop> shopsCheaperThanRecommended() {
        Set<Shop> result = new HashSet<>();

        for (Shop shop : shops) {
            boolean allCheaper = true;

            Iterator<StoreItem> it = shop.getItems().iterator();
            while (it.hasNext()) {
                StoreItem item = it.next();
                if (item.getPrice() >= item.getProduct().getRecommendedPrice()) {
                    allCheaper = false;
                    break;
                }
            }
            if (allCheaper) result.add(shop);
        }
        return result;
    }

    //Додав нову функціональність, яка потребує Map
    public Map<Shop, Double> getPriceStatistics(Product target) {
        Map<Shop, Double> stats = new HashMap<>();
        for (Shop shop : shops) {
            Double price = shop.getPrice(target);
            if (price != null) stats.put(shop, price);
        }
        return stats;
    }
}
