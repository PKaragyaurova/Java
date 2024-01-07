package elvesShop.models;


import elvesShop.common.ExceptionMessages;

public class InstrumentImpl implements Instrument {
    private int power;


    public InstrumentImpl(int power) {
        setPower(power);
    }

    public void setPower(int power) {
        if (power < 0) {
            throw new IllegalArgumentException(ExceptionMessages.INSTRUMENT_POWER_LESS_THAN_ZERO);
        }
        this.power = power;
    }

    @Override
    public int getPower() {
        return this.getPower();
    }

    @Override
    public void use() {
        this.setPower(this.getPower()-10);
        if (this.getPower() < 0) {
            this.setPower(0);
        }
    }

    @Override
    public boolean isBroken() {
        return this.getPower()==0;
    }
}