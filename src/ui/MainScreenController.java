package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainScreenController {

    private ChargeDataScreenController chargeData;
    private TableScreenController tableView;
    private AdjustScreenController adjustScreen;
    
    @FXML
    private BorderPane mainPane;
    
    public MainScreenController() {
    	chargeData = new ChargeDataScreenController();
    	tableView = new TableScreenController();
    	adjustScreen = new AdjustScreenController();
    }

    @FXML
    public void loadAdjustScreen(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxmlFiles/AdjustScreen.fxml"));
    	fxmlLoader.setController(adjustScreen);

    	Parent adjustScreen = fxmlLoader.load();
    	mainPane.setCenter(adjustScreen);
    }

    @FXML
    public void loadDataScreen(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxmlFiles/ChargeDataScreen.fxml"));
    	fxmlLoader.setController(chargeData);
    	
    	Parent loadData = fxmlLoader.load();
    	mainPane.setCenter(loadData);
    }

    @FXML
    public void loadTableView(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxmlFiles/TableScreen.fxml"));
    	fxmlLoader.setController(tableView);
    	
    	Parent tableScreen = fxmlLoader.load();
    	mainPane.setCenter(tableScreen);
    }

}
