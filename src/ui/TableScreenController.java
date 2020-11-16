package ui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableScreenController {
	

	@FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> accountColumn;

    @FXML
    private TableColumn<?, ?> totalAccountColumn;

    @FXML
    private TableColumn<?, ?> totalAfterAdjustColumn;

}

