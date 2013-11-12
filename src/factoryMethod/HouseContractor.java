package factoryMethod;


public class HouseContractor {

    public static void main(String[] args) {
        HouseCreator houseCreator = new TwoStoreHouseCreator();

        House house = houseCreator.createHouse();

        System.out.println("House has price: " + house.price());
    }
}
