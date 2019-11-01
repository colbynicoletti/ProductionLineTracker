package sample;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.util.Date;

public class Controller {

  @FXML
  private TextField tf_productName;

  @FXML
  private TextField tf_manufacturer;

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
  private ChoiceBox<String> cb_itemType;

  @FXML
  private TableView<Product> tv_existingProducts;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_productName;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_manufacturer;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_itemType;

  /**
   * @param event The method below controls the code for the button when pressed.
   * @author Colby Nicoletti
   */
  @FXML
  void addProduct(MouseEvent event) {
    String productName = tf_productName.getText();
    String manufacturer = tf_manufacturer.getText();
    String itemType = cb_itemType.getValue();
//    String sql =
//        "INSERT INTO Product(type, manufacturer, name) VALUES ('" + itemType + "', '" + manufacturer
//            + "', '"
//            + productName + "')";
//    Main.executeSql(sql);
//
//    Product testProduct = new Widget("iPod", "Apple", "AM");
//    System.out.println(testProduct.toString());

    ArrayList<Product> arrayProduct = new ArrayList<>();
    ObservableList<Product> observableProduct = FXCollections.observableArrayList(arrayProduct);
    tv_existingProducts_productName.setCellValueFactory(new PropertyValueFactory("productName"));
    tv_existingProducts.setItems(observableProduct);
    observableProduct.add(new Product("productName") {
      @Override
      public int getID() {
        return 0;
      }
    });
  }

  /**
   * @param
   */
  @FXML
  void recordProduction(MouseEvent event) {
    System.out.println("\"Record Production\" Button has been clicked.");
  }

  public void chooseQuantity(MouseEvent mouseEvent) {
  }

  /**
   * The code below controls adding the options into the combo box and allows it to be editable. It
   * also selects the first option and places that in the combo box when run.
   */
  @FXML
  public void initialize() {
    //Adds 1-10 to Combo Box called Choose Quantity
    cb_chooseQuantity.setEditable(true);
    cb_chooseQuantity.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    cb_chooseQuantity.getSelectionModel().selectFirst();

    for (ItemType it : ItemType.values()) {
      cb_itemType.getItems().add(it + " " + it.code);
    }

    ProductionRecord pr = new ProductionRecord(0, 3, "1", new Date());
    ta_productionLog.setText(pr.toString());

//  ArrayList<Bike> bikesAL = new ArrayList<>();
//  ObservableList<Bike> bikes = FXCollections.observableArrayList(bikesAL);
//
//    numGearsCol.setCellValueFactory(new PropertyValueFactory("numGears"));
//      bikeTable.setItems(bikes);
//
//    bikes.add(new Bike(12));

  } //end intialize

  @FXML
  void itemType(MouseEvent event) {

  }
}


