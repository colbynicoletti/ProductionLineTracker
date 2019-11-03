package sample;

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public String code;

  /**
   * Constructor for ItemType that passes String code.
   *
   * @param code String
   */
  ItemType(String code) {
    this.code = code;
  }

  /**
   * Accessor for String code.
   *
   * @return
   */
  public String getCode() {
    return code;
  }
} //end ItemType
