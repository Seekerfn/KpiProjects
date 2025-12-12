import java.util.*;

public class ProductSearchService {

    private List<OnlineStore> stores = new ArrayList<>();

    public void addStore(OnlineStore store) {
        stores.add(store);
    }

    // =============================
    // Task 1 – untyped Iterator
    // =============================
    public double findMinPrice(Product product) {
        double min = Double.MAX_VALUE;

        Iterator it = stores.iterator(); // untyped iterator
        while (it.hasNext()) {
            OnlineStore s = (OnlineStore) it.next();
            if (s.getProducts().containsKey(product)) {
                double price = s.getProducts().get(product);
                if (price < min) min = price;
            }
        }

        return min;
    }

    // =============================
    // Task 2 – typed Iterator
    // =============================
    public List<OnlineStore> storesWithMinPrice(Product product) {
        double min = findMinPrice(product);
        List<OnlineStore> result = new ArrayList<>();

        Iterator<OnlineStore> it = stores.iterator();
        while (it.hasNext()) {
            OnlineStore s = it.next();
            if (s.getProducts().containsKey(product) &&
                    s.getProducts().get(product) == min) {
                result.add(s);
            }
        }

        return result;
    }

    // =============================
    // Task 3 – typed for-each loop
    // =============================
    public boolean existsStoreAllCheaperThanRecommended() {

        for (OnlineStore store : stores) { // typed for-each
            boolean allCheaper = true;

            for (Map.Entry<Product, Double> entry : store.getProducts().entrySet()) {
                Product p = entry.getKey();
                double price = entry.getValue();

                if (price >= p.getRecommendedPrice()) {
                    allCheaper = false;
                    break;
                }
            }

            if (allCheaper) return true;
        }

        return false;
    }
}