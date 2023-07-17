package CustomersOrderManagementSoftwareSystem.bonus;

public class Spider extends Animal{
    public Spider(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("the spider is eating insects");
    }
}
