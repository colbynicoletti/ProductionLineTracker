package sample;

public abstract class Product implements Item {

  private int id;
  private ItemType type;
  private String manufacturer;
  private String name;

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

  public Product(String name, String manufacturer, ItemType type) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.type = type;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Manufacturer: " + manufacturer + "\n"
        +  "Type: " + type;
  }
}


