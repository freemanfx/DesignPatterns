package factoryMethod;

public class TwoStoreHouseCreator extends HouseCreator{
    @Override
    House createHouse() {
        return new TwoStoreHouse();
    }

    private class TwoStoreHouse implements House {
        @Override
        public Long price() {
            return 100L;
        }
    }
}
