package sample;

import java.util.Date;

public class ProductionRecord {

  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;
  private String productName;

  /**
   * Constructor for ProductionRecord that passes int productID
   *
   * @param productID
   */
  public ProductionRecord(int productID) {
    this.productID = productID;
    this.productionNumber = 0;
    this.serialNumber = "0";
    this.dateProduced = new Date();
  }

  /**
   * Constructor for ProductionRecord that passes int productionNumber, int productID, String
   * serialNumber, Date dateProduced
   *
   * @param productionNumber
   * @param productID
   * @param serialNumber
   * @param dateProduced
   */
  public ProductionRecord(int productionNumber, int productID, String serialNumber,
      Date dateProduced) {
    this.productionNumber = productionNumber;
    this.productID = productID;
    this.serialNumber = serialNumber;
    this.dateProduced = dateProduced;
  }

  /**
   * Constructor for ProductionRecord that passes Product product, int itemCount
   *
   * @param product
   * @param itemCount
   */
  ProductionRecord(Product product, int itemCount) {
    dateProduced = new Date();
    productName = product.getName();
    serialNumber =
        product.getManufacturer().substring(0, 3) + product.getItemType().getCode() + String
            .format("%05d", itemCount);

  }

  /**
   * Gives int productionNumber, int productID, String serialNumber, Date dateProduced
   *
   * @return productionNumber, productID, serialNumber, dateProduced
   */
  @Override
  public String toString() {
    return String
        .format("Prod. Num: %s Product ID: %s Serial Num: %s Date: %s", productionNumber, productID,
            serialNumber, dateProduced);
  }

  /**
   * Accessor for int productionNumber
   *
   * @return productionNumber
   */
  public int getProductionNumber() {
    return productionNumber;
  }

  /**
   * Mutator for int productionNumber
   *
   * @param productionNumber
   */
  public void setProductionNumber(int productionNumber) {
    this.productionNumber = productionNumber;
  }

  /**
   * Accessor for int productID
   *
   * @return productID
   */
  public int getProductID() {
    return productID;
  }

  /**
   * Mutator for int productID
   *
   * @param productID
   */
  public void setProductID(int productID) {
    this.productID = productID;
  }

  /**
   * Accessor for String serialNumber
   *
   * @return serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Mutator for String serialNumber
   *
   * @param serialNumber
   */
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * Accessor for Date dateProduced
   *
   * @return dateProduced
   */
  public Date getDateProduced() {
    return dateProduced;
  }

  /**
   * Mutator for Date dateProduced
   *
   * @param dateProduced
   */
  public void setDateProduced(Date dateProduced) {
    this.dateProduced = dateProduced;
  }
}
