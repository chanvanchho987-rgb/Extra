package scene_main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

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

        var stage = (Stage) label_data.getScene().getWindow();
        
        var view_input = getClass().getResource("../scene_input/View.fxml");
        var controller_input = new scene_input.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_input);
        loader.setController(controller_input);

        var scene = new Scene(loader.load());

        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void goto_output(ActionEvent event) throws IOException {
        // Implementation for navigating to output scene

        var stage = (Stage) label_data.getScene().getWindow();

        var view_output = getClass().getResource("../scene_output/View.fxml");
        var controller_output = new scene_output.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_output);
        loader.setController(controller_output);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {

    }

}
