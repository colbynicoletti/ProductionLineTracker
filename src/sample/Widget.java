package sample;

public class Widget extends Product {
  Widget(String name, String manufacturer, ItemType type){
    super(name, manufacturer, ItemType.VISUAL);
  }

  @Override
  public int getID() {
    return 0;
  }
}
