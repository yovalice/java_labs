package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.


 **/
class House {
    int valueHouse, size, bath, beds;
    Kitchen kitchen;

    House(int valueHouse, int size, int bath, int beds) {
        this.valueHouse = valueHouse;
        this.size = size;
        this.bath = bath;
        this.beds = beds;
    }
}

class Kitchen{
    int numberBurners;
    int numbSinks;
    int numbFreezer;

    Kitchen(int numberBurners, int numbSinks, int numbFreezer) {
        this.numberBurners = numberBurners;
        this.numbSinks = numbSinks;
        this.numbFreezer = numbFreezer;
    }
}

class HouseController {

    public static void main(String[] args){
        House bluehouse = createHouse(100000,5000, 4, 6);
        House yellowhouse = createHouse(90000,8000, 2, 3);

        Kitchen bluekitchen = createKitchen(4,2,1);
        Kitchen yellowkitchen = createKitchen(6,2,2);


        bluehouse.kitchen = bluekitchen;
        yellowhouse.kitchen = yellowkitchen;

        System.out.println("The blue house has " + bluehouse.bath + " bathrooms and " + bluehouse.beds
        + " bedrooms and " + bluehouse.size + " is its size and " + bluehouse.valueHouse + " is the value of the house. \n"
        + " The kitchen of the blue house has " + bluehouse.kitchen.numberBurners + " burners and "
                + bluehouse.kitchen.numbSinks
        + " sinks and " + bluehouse.kitchen.numbFreezer + " freezer ");

        System.out.println("The yellow house has " + yellowhouse.bath + " bathrooms and " + yellowhouse.beds +
                " bedrooms and " +
        yellowhouse.size + " is it's size and " + yellowhouse.valueHouse + " is it's value. \n" +
        " The kitchen of the yellow house has " + yellowhouse.kitchen.numberBurners + " burners and " +
        yellowhouse.kitchen.numbSinks + " sinks and " + yellowhouse.kitchen.numbFreezer + " freezers.");
    }

    public static Kitchen createKitchen (int numberBurners, int numbSinks, int numbFreezer){

        Kitchen kitchen = new Kitchen(numberBurners, numbSinks, numbFreezer);
        return kitchen;

    }

    public static House createHouse(int valueHouse, int size, int bath, int beds){

        House house = new House(valueHouse, size, bath, beds);
        return house;


    }
}


