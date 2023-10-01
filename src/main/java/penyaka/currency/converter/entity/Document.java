package penyaka.currency.converter.entity;

public enum Document {

    CITIZEN_PASSPORT("Empty"), DRIVERS_LICENCES("Empty"), ABROAD_PASSPORT("Empty");

    private final String id;
    Document(String id) {
        this.id=id;
    }
}
