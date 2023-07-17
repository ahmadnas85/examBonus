package CustomersOrderManagementSoftwareSystem.bonus;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("the cat is playing");
    }
    @Override
    public void eat(){
        System.out.println("the cat is eating");
    }
}

