package sample;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public abstract class Product implements Item {

  private int id;
  private ItemType type;
  private String manufacturer;
  private String name;

//  public Product(TextField tf_productName, TextField tf_manufacturer, ChoiceBox<String> cb_itemType) {
//  }

  public Product(String name, String manufacturer, ItemType type) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.type = type;
  }

  public Product(String productName) {

  }

  public int getId() {
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setType(ItemType type){
    this.type = type;
  }

  public ItemType getType(){
    return type;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Manufacturer: " + manufacturer + "\n"
        +  "Type: " + type;
  }
}


