package sample;

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  public MoviePlayer(String name, String manufacturer, Screen screen, MonitorType monitorType) {
    super(name, manufacturer, "VISUAL");
    this.screen = screen;
    this.monitorType = monitorType;
  }

  @Override
  public int getID() {
    return 0;
  }

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next movie");
  }


  @Override
  public String toString() {
    return String.format("%s\nScreen: %s\nMonitor Type: %s", super.toString(), screen, monitorType);
  }


}
