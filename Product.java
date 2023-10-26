package HOMEWORK;
public class Product{
    String name;
    String brand;
    double price;
    Product(){
        name = "<name>";
        brand ="<brand>";
        price = 200;
    }
String displayInfo(){
    return String.format("%s - %s - %.2f", brand, name, price);
}

}