import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 20000);
        Product phone = new Product("Phone", 12000);

        Shop shop1 = new Shop("Rozetka");
        shop1.addProduct(laptop, 18500);
        shop1.addProduct(phone, 11000);

        Shop shop2 = new Shop("Comfy");
        shop2.addProduct(laptop, 19500);
        shop2.addProduct(phone, 13000);

        Shop shop3 = new Shop("Allo");
        shop3.addProduct(laptop, 18500);
        shop3.addProduct(phone, 11999);

        SearchService service = new SearchService();
        service.addShop(shop1);
        service.addShop(shop2);
        service.addShop(shop3);

        // 1) мінціна
        System.out.println("Min price Laptop: " + service.findMinPrice(laptop));

        // 2) магазини з мінціною
        List<Shop> best = service.findShopsWithMinPrice(laptop);
        System.out.println("Best shops:");
        for (Shop s : best) System.out.println(" - " + s.getName());

        // 3) магазини де ВСЕ дешевше RRP
        List<Shop> cheap = service.shopsCheaperThanRecommended();
        System.out.println("Shops with all prices < RRP:");
        for (Shop s : cheap) System.out.println(" - " + s.getName());
    }
}
