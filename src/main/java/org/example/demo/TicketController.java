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
    private TableView<Ticket> Table;

    @FXML
    private Button backBtn;

    @FXML
    private TableColumn<Ticket, String> fName;

    @FXML
    private TableColumn<Ticket, String> lName;

    @FXML
    private TableColumn<Ticket, String> name;

    @FXML
    private TableColumn<Ticket, String> ticket;

    @FXML
    private TableColumn<Ticket, Integer> ticketCount;

    @FXML
    private Button privilegiesBtn;

    @FXML
    private Button scheduleBtn;

    ObservableList<Ticket> list = FXCollections.observableArrayList(
            new Ticket( "Тимур", "Зайцев", "Максимович", "Tct-096", 3),
            new Ticket( "София", "Федерова", "Ивановна", "Tct-097", 1),
            new Ticket( "Яна", "Латышева", "Артемовна", "Tct-098", 4),
            new Ticket( "Ноколай", "Глебов", "Святославович", "Tct-099", 2),
            new Ticket( "Иван", "Мещеряков", "Никитич", "Tct-100", 1)
    );

    @FXML
    void initialize() {
        name.setCellValueFactory(new PropertyValueFactory<Ticket, String>("name"));
        lName.setCellValueFactory(new PropertyValueFactory<Ticket, String>("lName"));
        fName.setCellValueFactory(new PropertyValueFactory<Ticket, String>("fName"));
        ticket.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticket"));
        ticketCount.setCellValueFactory(new PropertyValueFactory<Ticket, Integer>("amount"));

        Table.setItems(list);
        int count = list.size();

        CountOfWrites.setText("" + count);

        AddBtn.setOnAction(event -> {
            System.out.println("Запись добавлена");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Новый билет");
            alert.setHeaderText(null);
            alert.setContentText("Новый тестовый билет добавлен");

            list.add(new Ticket( "name", "last name", "father name", "Tct-xxx", 0));

            int count1 = list.size();
            CountOfWrites.setText("" + count1);

            alert.showAndWait();
        });


        DelBtn.setOnAction(event -> {
            System.out.println("Удаление билета");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            TableView.TableViewSelectionModel<Ticket> selectionModel = Table.getSelectionModel();
            System.out.println(selectionModel.getFocusedIndex());

            list.remove(selectionModel.getFocusedIndex());

            alert.setTitle("Удаление билета");
            alert.setHeaderText(null);
            alert.setContentText("Билет успешно удален");

            int count2 = list.size();
            CountOfWrites.setText("" + count2);

            alert.showAndWait();
        });

        backBtn.setOnAction(event -> {
            backBtn.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));

            try { loader.load(); }
            catch (IOException e){ e.printStackTrace(); }

            Parent root = loader.getRoot();
            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        EditBtn.setOnAction(event -> {
            System.out.println("Выполнено редактирование билета>");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Редактировать Билет");
            alert.setHeaderText(null);
            alert.setContentText("Билет редактирован");

            alert.showAndWait();
        });

        FilterBtn.setOnAction(event -> {
            System.out.println("Выполнен фильтр");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Фильтр");
            alert.setHeaderText(null);
            alert.setContentText("Параметры фильтрации");

            alert.showAndWait();
        });

        scheduleBtn.setOnAction(event -> {
            scheduleBtn.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));

            try { loader.load(); }
            catch (IOException e){ e.printStackTrace(); }

            Parent root = loader.getRoot();
            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        privilegiesBtn.setOnAction(event -> {
            privilegiesBtn.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("privileges.fxml"));

            try { loader.load(); }
            catch (IOException e){ e.printStackTrace(); }

            Parent root = loader.getRoot();
            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

}

