package productLineTracker;

public interface Item {

  /**
   * Accessor for int id.
   *
   * @return String
   */
  int getID();

  /**
   * Mutator for String name.
   *
   * @param name String
   */
  void setName(String name);

  /**
   * Accessor for String name.
   *
   * @return name String
   */
  String getName();

  /**
   * Mutator for String manufacturer.
   *
   * @param manufacturer String
   */
  void setManufacturer(String manufacturer);

  /**
   * Accessor for String manufacturer.
   *
   * @return manufacturer String
   */
  String getManufacturer();
}
