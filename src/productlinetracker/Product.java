package productlinetracker;

public abstract class Product implements Item {

  protected String productName;
  private int id;
  private ItemType itemType;
  private String manufacturer;
  //private String productName;

  /**
   * Contructor for Product that passes String name, String manufacturer, ItemType type as
   * parameters.
   *
   * @param productName  String
   * @param manufacturer String
   * @param itemType     ItemType
   */
  public Product(String productName, String manufacturer, ItemType itemType) {
    this.productName = productName;
    this.manufacturer = manufacturer;
    this.itemType = itemType;
  }

  /**
   * Accessor for int id.
   *
   * @return id int
   */
  public int getId() {
    return id;
  }

  /**
   * Mutator for int id.
   *
   * @param id int
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Accessor for String productName.
   *
   * @return productName String
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Mutator for String productName.
   *
   * @param productName String
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Mutator for String manufacturer.
   *
   * @param manufacturer String
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Accessor for String manufacturer.
   *
   * @return manufacturer String
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Mutator for ItemType type.
   *
   * @param itemType ItemType
   */
  public void setItemType(ItemType itemType) {
    this.itemType = itemType;
  }

  /**
   * Accessor for ItemType type.
   *
   * @return type ItemType
   */
  public ItemType getItemType() {
    return itemType;
  }

  /**
   * Gives name, manufacturer, type.
   *
   * @return String name, String manufacturer, ItemType type
   */
  @Override
  public String toString() {
    return "Name: " + productName + "\n"
        + "Manufacturer: " + manufacturer + "\n"
        + "Type: " + itemType;
  }
}


