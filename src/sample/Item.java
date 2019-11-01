package sample;

public interface Item {

  /**
   * Accessor for int getID()
   * @return
   */
  int getID();

  /**
   * Mutator for String name
   * @param name
   */
  void setName(String name);

  /**
   * Accessor for String name
   * @return name
   */
  String getName();

  /**
   * Mutator for String manufacturer
   * @param manufacturer
   */
  void setManufacturer(String manufacturer);

  /**
   * Accessor for String manufacturer
   * @return manufacturer
   */
  String getManufacturer();
}
