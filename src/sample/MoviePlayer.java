package sample;

public class MoviePlayer extends Product implements MultimediaControl {

  private String screenType;
  private String monitorType;

  public MoviePlayer(String name, String manufacturer, String type) {
    super(name, manufacturer, type);
  }

  @Override
  public int getID() {
    return 0;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  public String toString(String screenType, String monitorType) {
    return super.toString() + "Screen Type: " + screenType + "\n" + "Monitor Type: " + monitorType;
  }
}
