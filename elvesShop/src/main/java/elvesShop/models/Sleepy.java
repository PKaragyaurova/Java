package elvesShop.models;

public class Sleepy extends BaseHelper {

    public Sleepy(String name) {
        super(name, 50);
    }

    @Override
    public void work() {
        this.setEnergy(this.getEnergy() - 15);
        if (this.getEnergy() < 0) {
            this.setEnergy(0);
        }
    }
}

