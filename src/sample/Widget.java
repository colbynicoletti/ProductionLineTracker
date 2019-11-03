package sample;

class Widget extends Product {

  Widget(String productName, String manufacturer, ItemType itemType) {
    super(productName, manufacturer, itemType);
  }

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
