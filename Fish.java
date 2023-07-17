package CustomersOrderManagementSoftwareSystem.bonus;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("the fish is playing in the water");
    }
    @Override
    public void walk(){
        System.out.println("the fish is walking in water");
    }
    @Override
    public void eat(){
        System.out.println("the fish is eating a smaller fish");
    }
}
