package productlinetracker;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  /**
   * Constructor for Screen that passes resolution, refreshRate, responseTime.
   *
   * @param resolution   String
   * @param refreshRate  int
   * @param responseTime int
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  /**
   * Accessor for resolution.
   *
   * @return resolution String
   */
  @Override
  public String getResolution() {
    return resolution;
  }

  /**
   * Accessor for refreshRate.
   *
   * @return refreshRate int
   */
  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  /**
   * Accessor for responseTime.
   *
   * @return responseTime int
   */
  @Override
  public int getResponseTime() {
    return responseTime;
  }

  /**
   * Mutator for resolution.
   *
   * @param resolution String
   */
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  /**
   * Mutator for refreshRate.
   *
   * @param refreshRate int
   */
  public void setRefreshRate(int refreshRate) {
    this.refreshRate = refreshRate;
  }

  /**
   * Mutator for responseTime.
   *
   * @param responseTime int
   */
  public void setResponseTime(int responseTime) {
    this.responseTime = responseTime;
  }

  /**
   * toString that returns resolution, refreshRate, responseTime.
   *
   * @return resolution String, refreshRate int, responseTime int
   */
  public String toString() {
    return String
        .format("Resolution: %s%nRefresh rate: %s%nResponse time: %s", resolution, refreshRate,
            responseTime);
  }

}