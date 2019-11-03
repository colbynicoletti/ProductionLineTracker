package productLineTracker;

public interface ScreenSpec {

  /**
   * Method call, Accessor for resolution.
   *
   * @return resolution String
   */
  public String getResolution();

  /**
   * Method call, Accessor for refreshRate.
   *
   * @return refreshRate int
   */
  public int getRefreshRate();

  /**
   * Method call, Accessor for responseTime.
   *
   * @return responseTime int
   */
  public int getResponseTime();

}
