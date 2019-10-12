package sample;

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private String mediaType;

  public AudioPlayer(String name, String manufacturer, String type, String mediaType, String audioSpecification) {
    super(name, manufacturer, type);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
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
  public void next() {
    System.out.println("Next");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Supported Audio Formats: " + mediaType + "\n"
        + "Supported Playlist Formats: " + audioSpecification;
  }
}
