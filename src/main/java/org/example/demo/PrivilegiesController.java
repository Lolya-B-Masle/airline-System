package org.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PrivilegiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddBtn;

    @FXML
    private Button DelBtn;

    @FXML
    private Button EditBtn;

    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private MenuBar NavBar;

    @FXML
    private TableColumn<?, ?> Path;

    @FXML
    private Menu ReportTbElement;

    @FXML
    private TableColumn<?, ?> Road;

    @FXML
    private Menu ServiceTbElement;

    @FXML
    private TableView<?> Table;

    @FXML
    private Menu WindowsTbElement;

    @FXML
    private Button appointBtn;

    @FXML
    private Button backBtn;

    @FXML
    private MenuItem canceledFlights;

    @FXML
    private MenuItem cashRegister;

    @FXML
    private MenuItem closeAll;

    @FXML
    private MenuItem completedFlights;

    @FXML
    private MenuItem flights;

    @FXML
    private MenuItem help;

    @FXML
    private MenuItem privileges;

    @FXML
    private MenuItem sendError;

    @FXML
    private MenuItem shedule;

    public void sample_add() throws IOException {
        Stage privelegies = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("privilegies.fxml"));
        privelegies.setTitle("Льготы");
       // privelegies.setScene(new Scene(root, ));
    }

    @FXML
    void initialize() {

    }

}
