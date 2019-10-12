package sample;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  public Screen(String resolution, int refreshRate, int responseTime){
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public void setRefreshRate(int refreshRate) {
    this.refreshRate = refreshRate;
  }

  public void setResponseTime(int responseTime) {
    this.responseTime = responseTime;
  }

  public String toString(){
    return String.format("Resolution: %s\nRefresh rate: %s\nResponse time: %s", resolution, refreshRate, responseTime);
  }

}