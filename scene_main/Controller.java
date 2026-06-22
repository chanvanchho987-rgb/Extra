package scene_main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_data;

    @FXML
    void goto_input(ActionEvent event) throws IOException {
        // Implementation for navigating to input scene

    }

    @FXML
    void goto_output(ActionEvent event) throws IOException {
        // Implementation for navigating to output scene
        var stage = (Stage) label_data.getScene().getWindow();
        var view_output = getClass().getResource("../scene_output/View.fxml");
        var controller_output = new scene_output.Controller();

    }

    @FXML
    void initialize() {

    }

}
