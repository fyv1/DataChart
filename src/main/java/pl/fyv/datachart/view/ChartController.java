package pl.fyv.datachart.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pl.fyv.datachart.Main;

import java.awt.event.ActionEvent;


public class ChartController {

    private Main main;
    private Stage stage;

    @FXML
    private Button loadFile;
    private FileChooser fileChooser = new FileChooser();

    public ChartController() {}

    @FXML
    private void initialize() {
        loadFile.setOnAction(this::callFileChooser);
    }

    @FXML
    private void callFileChooser(ActionEvent actionEvent) {

    }





    public void setMain(Main main) {
        this.main = main;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
