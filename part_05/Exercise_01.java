package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class_01 {
    public static void main(String[] args) {

        Class_02 class2 = new Class_02();
        class2.type = "House";
        System.out.println("Property type " + class2.getType());
        class2.setLocation("USA");
        System.out.println("Property location " + class2.getLocation());
        class2.setSize(12000);
        System.out.println("Property size" + class2.getSize());
        class2.property();
    }
}

class Class_02 {
    String type;
    private String location;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void property() {

        Class_03 class3 = new Class_03();

        class3.setReSalePrice(500000);
        System.out.println("Property Resale Price " + class3.getReSalePrice());
        class3.setCurrency("USD");
        System.out.println("Property money currency " + class3.getCurrency());
        class3.setSalePrice(420000);
        System.out.println("Property sale price " + class3.getSalePrice());
        class3.setPropertyValue(5200000);
        System.out.println("Property value " + class3.getPropertyValue());


    }

    class Class_03 {
        int reSalePrice;
        String currency;
        private int SalePrice;
        private int propertyValue;

        public int getReSalePrice() {
            return reSalePrice;
        }

        public void setReSalePrice(int reSalePrice) {
            this.reSalePrice = reSalePrice;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getSalePrice() {
            return SalePrice;
        }

        public void setSalePrice(int salePrice) {
            SalePrice = salePrice;
        }

        public int getPropertyValue() {
            return propertyValue;
        }

        public void setPropertyValue(int propertyValue) {
            this.propertyValue = propertyValue;
        }
    }
}