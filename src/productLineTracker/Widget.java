package productLineTracker;

class Widget extends Product {

  /**
   * Constructor for Widget that passes productName, manufacturer, itemType.
   *
   * @param productName  String
   * @param manufacturer String
   * @param itemType     ItemType
   */
  Widget(String productName, String manufacturer, ItemType itemType) {
    super(productName, manufacturer, itemType);
  }

  /**
   * Accessor for id.
   *
   * @return id int
   */
  @Override
  public int getID() {
    return 0;
  }

  @Override
  public void setName(String name) {

  }

  @Override
  public String getName() {
    return null;
  }
}
