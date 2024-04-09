package org.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<Privelege> Table;

    @FXML
    private TableColumn<Privelege, String> amount;

    @FXML
    private Button appointBtn;

    @FXML
    private Button backBtn;

    @FXML
    private TableColumn<Privelege, String> conditions;

    @FXML
    private TableColumn<Privelege, String> privelegies;

    @FXML
    private Button scheduleBtn;

    @FXML
    private Button cashRegisterBtn;

    ObservableList<Privelege> list = FXCollections.observableArrayList(
            new Privelege( 1, "скидка 10%", "Постоянный клиент", "4"),
            new Privelege( 2, "скидка 15%", "Постоянный клиент", "2")

    );

    @FXML
    void initialize() {

        privelegies.setCellValueFactory(new PropertyValueFactory<Privelege, String>("name"));
        conditions.setCellValueFactory(new PropertyValueFactory<Privelege, String>("condition"));
        amount.setCellValueFactory(new PropertyValueFactory<Privelege, String>("amount"));

        Table.setItems(list);

        AddBtn.setOnAction(event -> {
            System.out.println("Новая льгота добавлена");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Новая льгота");
            alert.setHeaderText(null);
            alert.setContentText("Новая льгота добавлена");

            list.add(new Privelege(99, "test", "test", "0"));

            alert.showAndWait();
        });


        DelBtn.setOnAction(event -> {
            System.out.println("Удаление льготы");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            TableView.TableViewSelectionModel<Privelege> selectionModel = Table.getSelectionModel();
            System.out.println(selectionModel.getFocusedIndex());

            list.remove(selectionModel.getFocusedIndex());

            alert.setTitle("Удаление льготы");
            alert.setHeaderText(null);
            alert.setContentText("Льгота удалена");

            alert.showAndWait();
        });


        appointBtn.setOnAction(event -> {
            System.out.println("Выполнено назначение льготы>");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Назначить льготу");
            alert.setHeaderText(null);
            alert.setContentText("Льгота назначена");

            alert.showAndWait();
        });

        EditBtn.setOnAction(event -> {
            System.out.println("Выполнено редактирование билета>");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Редактировать Билет");
            alert.setHeaderText(null);
            alert.setContentText("Билет редактирован");

            alert.showAndWait();
        });

        cashRegisterBtn.setOnAction(event -> {
            cashRegisterBtn.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Tickets.fxml"));

            try {
                loader.load();
            }
            catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        backBtn.setOnAction(event -> {
            backBtn.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));

            try {
                loader.load();
            }
            catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


    }

}
