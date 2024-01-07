package elvesShop.models;

import java.util.Collection;

    public class ShopImpl implements Shop {

        @Override
        public void craft(Present present, Helper helper) {


            if (helper.canWork() && helper.getInstruments().size() > 0) {
                Collection<Instrument> instruments = helper.getInstruments();
                for (Instrument instrument : instruments) {
                    while (!present.isDone() && helper.canWork() && !instrument.isBroken()) {
                        present.getCrafted();
                        helper.work();
                        instrument.use();
                    }
                }
            }
        }
    }

