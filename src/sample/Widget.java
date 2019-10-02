package sample;

public class Widget extends Product {
  Widget(String name, String manufacturer, String type){
    super(name, manufacturer, type);
  }

  @Override
  public int getID() {
    return 0;
  }
}
