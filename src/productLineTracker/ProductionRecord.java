package productLineTracker;

import java.util.Date;

public class ProductionRecord {

  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;

  /**
   * Constructor for ProductionRecord that passes int productID.
   *
   * @param productID int
   */
  public ProductionRecord(int productID) {
    this.productID = productID;
    this.productionNumber = 0;
    this.serialNumber = "0";
    this.dateProduced = new Date();
  }

  /**
   * Constructor for ProductionRecord that passes int productionNumber, int productID, String
   * serialNumber, Date dateProduced.
   *
   * @param productionNumber int
   * @param productID        int
   * @param serialNumber     String
   * @param dateProduced     Date
   */
  public ProductionRecord(int productionNumber, int productID, String serialNumber,
      Date dateProduced) {
    this.productionNumber = productionNumber;
    this.productID = productID;
    this.serialNumber = serialNumber;
    this.dateProduced = dateProduced;
  }

  /**
   * Constructor for ProductionRecord that passes Product product, int itemCount.
   *
   * @param product   Product
   * @param itemCount int
   */
  ProductionRecord(Product product, int itemCount) {
    dateProduced = new Date();
    serialNumber =
        product.getManufacturer().substring(0, 3) + product.getItemType().getCode() + String
            .format("%05d", itemCount);

  }

  /**
   * Gives int productionNumber, int productID, String serialNumber, Date dateProduced.
   *
   * @return productionNumber int , productID int , serialNumber String, dateProduced Date
   */
  @Override
  public String toString() {
    return String
        .format("Prod. Num: %s Product ID: %s Serial Num: %s Date: %s", productionNumber, productID,
            serialNumber, dateProduced);
  }

  /**
   * Accessor for int productionNumber.
   *
   * @return productionNumber int
   */
  public int getProductionNumber() {
    return productionNumber;
  }

  /**
   * Mutator for int productionNumber.
   *
   * @param productionNumber int
   */
  public void setProductionNumber(int productionNumber) {
    this.productionNumber = productionNumber;
  }

  /**
   * Accessor for int productID.
   *
   * @return productID int
   */
  public int getProductID() {
    return productID;
  }

  /**
   * Mutator for int productID.
   *
   * @param productID int
   */
  public void setProductID(int productID) {
    this.productID = productID;
  }

  /**
   * Accessor for String serialNumber.
   *
   * @return serialNumber String
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Mutator for String serialNumber.
   *
   * @param serialNumber String
   */
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * Accessor for Date dateProduced.
   *
   * @return dateProduced Date
   */
  public Date getDateProduced() {
    return dateProduced;
  }

}
