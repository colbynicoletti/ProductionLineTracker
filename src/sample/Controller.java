package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

  @FXML
  private TextField tf_productName;

  @FXML
  private TextField tf_manufacturer;

  @FXML
  private TextField tf_itemType;

  @FXML
  private Button btn_addProduct;

  @FXML
  private ListView<?> lv_chooseProduct;

  @FXML
  private ComboBox<?> cb_chooseQuantity;

  @FXML
  private Button btn_recordProduction;

  @FXML
  private TextArea ta_productionLog;

  @FXML
  void addProduct(MouseEvent event) {
    System.out.println("\"Add Product\" Button has been clicked.");
  }

  @FXML
  void recordProduction(MouseEvent event) {
    System.out.println("\"Record Production\" Button has been clicked.");
  }

}
