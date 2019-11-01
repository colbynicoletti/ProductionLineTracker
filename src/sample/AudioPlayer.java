package sample;

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private String mediaType;

  /**
   *  Accessor for String audioSpecification
   * @return audioSpecification
   */
  public String getAudioSpecification() {
    return audioSpecification;
  }

  /**
   *  Mutator for String audioSpecification
   * @param audioSpecification
   */
  public void setAudioSpecification(String audioSpecification) {
    this.audioSpecification = audioSpecification;
  }

  /**
   * Accessor for String mediaType
   * @return mediaType
   */
  public String getMediaType() {
    return mediaType;
  }

  /**
   *
   * Mutator for String mediaType
   * @param mediaType
   */
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Constructor for AudioPlayer that passes String name, String manufacturer, String mediaType and String audioSpecification
   * @param name
   * @param manufacturer
   * @param mediaType
   * @param audioSpecification
   */
  public AudioPlayer(String name, String manufacturer, String mediaType, String audioSpecification) {
    super(name, manufacturer, ItemType.VISUAL);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  /**
   * Accessor for int getID()
   * @return 0
   */
  @Override
  public int getID() {
    return 0;
  }

  /**
   * Method to show that audio player is playing
   */
  @Override
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Method to show that audio player is stopping
   */
  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Method to show that audio player is choosing the next song
   */
  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * Method to show that audio player is choosing the previous song
   */
  @Override
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Gives mediaType and audioSpecification
   * @return super.toString(), String mediaType, String audioSpecification
   */
  @Override
  public String toString() {
    return super.toString() + "\n" + "Supported Audio Formats: " + mediaType + "\n"
        + "Supported Playlist Formats: " + audioSpecification;
  }
}
