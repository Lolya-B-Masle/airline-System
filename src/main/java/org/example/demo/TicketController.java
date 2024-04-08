package org.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TicketController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddBtn;

    @FXML
    private TextField CountOfWrites;

    @FXML
    private Button DelBtn;

    @FXML
    private Button EditBtn;

    @FXML
    private Button FilterBtn;

    @FXML
    private MenuBar NavBar;

    @FXML
    private Menu ReportTbElement;

    @FXML
    private Menu ServiceTbElement;

    @FXML
    private TableView<?> Table;

    @FXML
    private Menu WindowsTbElement;

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
    private TableColumn<?, ?> fName;

    @FXML
    private MenuItem flights;

    @FXML
    private MenuItem help;

    @FXML
    private TableColumn<?, ?> lName;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private MenuItem privileges;

    @FXML
    private MenuItem sendError;

    @FXML
    private MenuItem shedule;

    @FXML
    private TableColumn<?, ?> ticket;

    @FXML
    private TableColumn<?, ?> ticketCount;

    @FXML
    void initialize() {


    }

}

