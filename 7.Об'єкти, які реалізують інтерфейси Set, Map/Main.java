
public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 20000);
        Product phone = new Product("Phone", 12000);

        Shop s1 = new Shop("Rozetka");
        s1.addProduct(laptop, 18500);
        s1.addProduct(phone, 11000);

        Shop s2 = new Shop("Comfy");
        s2.addProduct(laptop, 19500);
        s2.addProduct(phone, 13000);

        Shop s3 = new Shop("Allo");
        s3.addProduct(laptop, 18500);
        s3.addProduct(phone, 11999);

        SearchService service = new SearchService();
        service.addShop(s1);
        service.addShop(s2);
        service.addShop(s3);

        System.out.println("Min laptop price: " + service.findMinPrice(laptop));

        System.out.println("Shops with min price:");
        for (Shop s : service.findShopsWithMinPrice(laptop))
            System.out.println(" - " + s.getName());

        System.out.println("Shops where all products cheaper than RRP:");
        for (Shop s : service.shopsCheaperThanRecommended())
            System.out.println(" - " + s.getName());

        System.out.println("Price statistics (Map):");
        System.out.println(service.getPriceStatistics(laptop));
    }
}
