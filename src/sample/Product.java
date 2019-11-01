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

  /**
   * Contructor for Product that passes String name, String manufacturer, ItemType type as parameters.
   * @param name
   * @param manufacturer
   * @param type
   */
  public Product(String name, String manufacturer, ItemType type) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.type = type;
  }

  /**
   * Constructor for Product
   * @param productName
   */
  public Product(String productName) {

  }

  /**
   * Accessor for int id
   * @return int id
   */
  public int getId() {
    return id;
  }

  /**
   * Mutator for int id
   * @param id
   */
  public void setId(int id){
    this.id = id;
  }

  /**
   * Mutator for String name
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Accessor for String name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Mutator for String manufacturer
   * @param manufacturer
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Accessor for String manufacturer
   * @return manufacturer
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Mutator for ItemType type
   * @param type
   */
  public void setType(ItemType type){
    this.type = type;
  }

  /**
   * Accessor for ItemType type
   * @return type
   */
  public ItemType getType(){
    return type;
  }

  /**
   * Gives name, manufacturer, type
   * @return String name, String manufacturer, ItemType type
   */
  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Manufacturer: " + manufacturer + "\n"
        +  "Type: " + type;
  }
}


