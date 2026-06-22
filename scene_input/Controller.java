package scene_input;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import global.Global;
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
    void on_save(ActionEvent event) throws IOException {
        var input = textfield_input_data.getText();
        Global.data = input;
        

        var stage = (Stage) textfield_input_data.getScene().getWindow();

        var view_input = getClass().getResource("../scene_main/View.fxml");
        var controller_input = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_input);
        loader.setController(controller_input);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {



    }

}
