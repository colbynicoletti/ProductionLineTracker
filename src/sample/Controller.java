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
  private ListView<String> lv_chooseProduct;

  @FXML
  private ComboBox<Integer> cb_chooseQuantity;

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

  public void chooseQuantity(MouseEvent mouseEvent) {
  }

  @FXML
  public void initialize() {
    cb_chooseQuantity.setEditable(true);
    cb_chooseQuantity.getItems().add(1);
    cb_chooseQuantity.getItems().add(2);
    cb_chooseQuantity.getItems().add(3);
    cb_chooseQuantity.getItems().add(4);
    cb_chooseQuantity.getItems().add(5);
    cb_chooseQuantity.getItems().add(6);
    cb_chooseQuantity.getItems().add(7);
    cb_chooseQuantity.getItems().add(8);
    cb_chooseQuantity.getItems().add(9);
    cb_chooseQuantity.getItems().add(10);
    cb_chooseQuantity.getSelectionModel().selectFirst();
  }
}
