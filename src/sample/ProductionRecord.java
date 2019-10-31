package sample;

import java.util.Date;

public class ProductionRecord {
  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;
  private String productName;

  public ProductionRecord(int productID){
    this.productID = productID;
    this.productionNumber = 0;
    this.serialNumber = "0";
    this.dateProduced = new Date();
  }

  public ProductionRecord(int productionNumber, int productID, String serialNumber, Date dateProduced){
    this.productionNumber = productionNumber;
    this.productID = productID;
    this.serialNumber = serialNumber;
    this.dateProduced = dateProduced;
  }

  ProductionRecord(Product product, int itemCount){
    dateProduced = new Date();
    productName = product.getName();

    serialNumber = product.getManufacturer().substring(0,3) + product.getType().getCode() + String.format("%05d", itemCount);

  }

  @Override
  public String toString(){
    return String.format("Prod. Num: %s Product ID: %s Serial Num: %s Date: %s", productionNumber, productID, serialNumber, dateProduced);
  }

  public int getProductionNumber() {
    return productionNumber;
  }

  public void setProductionNumber(int productionNumber) {
    this.productionNumber = productionNumber;
  }

  public int getProductID() {
    return productID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Date getDateProduced() {
    return dateProduced;
  }

  public void setDateProduced(Date dateProduced) {
    this.dateProduced = dateProduced;
  }
}
