package sample;

public class Screen implements ScreenSpec {
  private String resolution;
  private int refreshRate;
  private int responseTime;

  public void setResolution(String resolution){
    this.resolution = resolution;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  public void setRefreshRate(int refreshRate){
    this.refreshRate = refreshRate;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  public void setResponseTime(int responseTime){
    this.responseTime = responseTime;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }
}
