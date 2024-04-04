package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button AddBtn;

    @FXML
    private TableColumn<?, ?> Begin;

    @FXML
    private TableColumn<?, ?> BeginTime;

    @FXML
    private TextField CountOfWrites;

    @FXML
    private Button DelBtn;

    @FXML
    private Button EditBtn;

    @FXML
    private TableColumn<?, ?> End;

    @FXML
    private TableColumn<?, ?> EndTime;

    @FXML
    private Button FilterBtn;

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
    private Button SearchBtn;

    @FXML
    private Button ServiceBtn;

    @FXML
    private Menu ServiceTbElement;

    @FXML
    private TableView<?> Table;

    @FXML
    private Menu WindowsTbElement;

}
