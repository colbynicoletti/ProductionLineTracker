package productlinetracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

public class Controller {

  @FXML
  private TextField tf_productName;

  @FXML
  private TextField tf_manufacturer;

  @FXML
  private Button btn_addProduct;

  @FXML
  private ListView<Product> lv_chooseProduct;

  @FXML
  private ComboBox<String> cb_chooseQuantity;

  @FXML
  private Button btn_recordProduction;

  @FXML
  private TextArea ta_productionLog;

  @FXML
  private ChoiceBox<ItemType> cb_itemType;

  @FXML
  private TableView<Product> tv_existingProducts;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_productName;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_manufacturer;

  @FXML
  private TableColumn<?, ?> tv_existingProducts_itemType;

  ObservableList<Product> observableProduct = FXCollections.observableArrayList();
  /**
   * MouseEvent event when Add Product button is clicked.
   *
   * @param event MouseEvent
   */
  @FXML
  void addProduct(MouseEvent event) {
    String productName = tf_productName.getText();
    tf_productName.clear();
    String manufacturer = tf_manufacturer.getText();
    tf_manufacturer.clear();
    ItemType itemType = cb_itemType.getValue();

    observableProduct.add(new Widget(productName, manufacturer, itemType));
    lv_chooseProduct.getItems().clear();
    lv_chooseProduct.getItems().addAll(observableProduct);



    Main.executeSql(productName, manufacturer, itemType);

  } //end addProduct

  /**
   * MouseEvent event for Record Production button.
   *
   * @param event MouseEvent
   */
  @FXML
  void recordProduction(MouseEvent event) {
    System.out.println("\"Record Production\" Button has been clicked.");
    System.out.println();
    int t = Integer.parseInt(cb_chooseQuantity.getValue());
    System.out.println("The value is " + t);
    for(int i = 0; i < t; i++){
      Product p = lv_chooseProduct.getSelectionModel().getSelectedItem();
      ProductionRecord pr = new ProductionRecord(p,i);
      ta_productionLog.appendText(pr.toString() + "\n");
      //Prod. Num: 2 Product ID: iPhone Serial Num: AppAU00000 Date: Wed Nov 06 17:52:48 EST 2019

    }


  } //end recordProduction

  /**
   * MouseEvent event for Choose Quantity button.
   *
   * @param event MouseEvent
   */
  public void chooseQuantity(MouseEvent event) {
  }

  /**
   * Initialize method, this method controls what get intialized when the program starts.
   * @return
   */
  @FXML
  public void initialize() {

    //Adds 1-10 to Combo Box called Choose Quantity
    cb_chooseQuantity.setEditable(true);
    cb_chooseQuantity.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    cb_chooseQuantity.getSelectionModel().selectFirst();

    for (ItemType it : ItemType.values()) {
      cb_itemType.getItems().add(it);
    }

    tv_existingProducts_productName.setCellValueFactory(new PropertyValueFactory("productName"));
     tv_existingProducts_manufacturer.setCellValueFactory(new PropertyValueFactory("manufacturer"));
    tv_existingProducts_itemType.setCellValueFactory(new PropertyValueFactory("itemType"));
    tv_existingProducts.setItems(observableProduct);

    loadProductList();
    lv_chooseProduct.getItems().addAll(observableProduct);

  } //end intialize

  /**
   * MouseEvent event for Item Type.
   *
   * @param event MouseEvent
   */
  @FXML
  void itemType(MouseEvent event) {

  } //end itemType



  public void loadProductList(){
    Connection conn = Main.connectDb();

    try{
      String sql = "SELECT * FROM PRODUCT";
      PreparedStatement prepStatement = conn.prepareStatement(sql);
      ResultSet rs = prepStatement.executeQuery();

      while(rs.next()){
        int id = rs.getInt("ID");
        String productName = rs.getString("NAME");
        String code = rs.getString("TYPE");
        String manufacturer = rs.getString("MANUFACTURER");

        for(ItemType itemType : ItemType.values()){
//          System.out.println(itemType.name() + " " + code);
          if (itemType.name().equals(code)){
            observableProduct.add(new Widget(productName, manufacturer, itemType));
          } // end if
        } //end for
      } //end while
      tv_existingProducts.getItems().addAll(observableProduct);
      System.out.println(observableProduct);
    } catch (Exception e){

    }
  } //end loadProductList
} //end Controller


