package scene_input;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textfield_input_data;

    @FXML
    void on_save(ActionEvent event) {
        
        var stage = (Stage) textfield_input_data.getScene().getWindow();
        
        var view_main = getClass().getResource("../scene_main/View.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new FXMLLoader();

        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new Scene(loader.load());

        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
       

    }

}
