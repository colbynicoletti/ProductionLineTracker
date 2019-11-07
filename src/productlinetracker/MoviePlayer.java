package productlinetracker;

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  /**
   * Accessor for Screen screen.
   *
   * @return screen Screen
   */
  public Screen getScreen() {
    return screen;
  }

  /**
   * Mutator for Screen screen.
   *
   * @param screen Screen
   */
  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  /**
   * Accessor for MonitorType monitorType.
   *
   * @return monitorType MonitorType
   */
  public MonitorType getMonitorType() {
    return monitorType;
  }

  /**
   * Mutator for MonitorType monitorType.
   *
   * @param monitorType MonitorType
   */
  public void setMonitorType(MonitorType monitorType) {
    this.monitorType = monitorType;
  }

  /**
   * Constructor for MoviePlayer which passes String name, String manufacturer, Screen screen,
   * MonitorType monitorType.
   *
   * @param productName  String
   * @param manufacturer String
   * @param screen       Screen
   * @param monitorType  MonitorType
   */
  public MoviePlayer(String productName, String manufacturer, Screen screen,
      MonitorType monitorType) {
    super(productName, manufacturer, ItemType.VISUAL);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * Accessor for int ID.
   *
   * @return getID int
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

  /**
   * Method to show that movie player is playing.
   */
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * Method to show that movie player is stopping.
   */
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * Method to show that movie player is choosing the previous movie.
   */
  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * Method to show that movie player is choosing the next movie.
   */
  @Override
  public void next() {
    System.out.println("Next movie");
  }


  /**
   * Gives Screen screen and MonitorType monitorType.
   *
   * @return super.toString(), screen, monitorType
   */
  @Override
  public String toString() {
    return String.format("%s%nScreen: %s%nMonitor Type: %s", super.toString(), screen, monitorType);
  }


}
