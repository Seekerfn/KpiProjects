public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 25000);
        Product mouse = new Product("Mouse", 500);

        OnlineStore s1 = new OnlineStore("TechShop");
        s1.addProduct(laptop, 23000);
        s1.addProduct(mouse, 400);

        OnlineStore s2 = new OnlineStore("MegaStore");
        s2.addProduct(laptop, 25000);
        s2.addProduct(mouse, 450);

        OnlineStore s3 = new OnlineStore("BudgetShop");
        s3.addProduct(laptop, 23000);
        s3.addProduct(mouse, 300);

        ProductSearchService service = new ProductSearchService();
        service.addStore(s1);
        service.addStore(s2);
        service.addStore(s3);

        System.out.println("Min price for laptop: " + service.findMinPrice(laptop));

        System.out.println("Stores with minimal price:");
        for (OnlineStore store : service.storesWithMinPrice(laptop)) {
            System.out.println(" - " + store.getName());
        }

        System.out.println("Is there a store where all products are cheaper than recommended? " +
                service.existsStoreAllCheaperThanRecommended());
    }
}