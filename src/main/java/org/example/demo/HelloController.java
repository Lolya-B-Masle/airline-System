package org.example.demo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddBtn;

    @FXML
    private TableColumn<Flight, String> Begin;

    @FXML
    private TableColumn<Flight, String> BeginTime;

    @FXML
    private TextField CountOfWrites;

    @FXML
    private Button DelBtn;

    @FXML
    private Button EditBtn;

    @FXML
    private TableColumn<Flight, String> End;

    @FXML
    private TableColumn<Flight, String> EndTime;

    @FXML
    private Button FilterBtn;

    @FXML
    private TableColumn<Flight, Integer> ID;

    @FXML
    private MenuBar NavBar;

    @FXML
    private TableColumn<Flight, String> Path;

    @FXML
    private Menu ReportTbElement;

    @FXML
    private TableColumn<Flight, String> Road;

    @FXML
    private Button SearchBtn;

    @FXML
    private Button ServiceBtn;

    @FXML
    private Menu ServiceTbElement;

    @FXML
    private TableView<Flight> Table;

    @FXML
    private Menu WindowsTbElement;

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
    private MenuItem schedule;

    ObservableList<Flight> list = FXCollections.observableArrayList(
        new Flight(1, "ПЛ-524", "ВВО-ЕМВ-ПЛК", "26.06.24", "04.09.024", "6:05", "18:10"),
        new Flight(2, "С7-107", "ДМД-ВВО", "01.06.24", "23.10.24", "14:00", "22:30"),
        new Flight(3, "С7-108", "ВВО-ДМД", "01.06.24", "24.10.24", "1:00", "10:30"),
        new Flight(4, "С7-3741", "ТЛЧ-ВВО-ПРЛ", "31.03.24", "23.10.24", "17:05", "3:05"),
        new Flight(5, "С7-3272", "ПРЛ-ВВО-ТЛЧ", "01.04.24", "24.10.24", "4:55", "15:30"),
        new Flight(6, "SU-719", "ШРМ-ВВО", "21.09.24", "18.10.24", "16:15", "0:45")
    );

    @FXML
    void initialize() {
        ID.setCellValueFactory(new PropertyValueFactory<Flight, Integer>("id"));
        Road.setCellValueFactory(new PropertyValueFactory<Flight, String>("path"));
        Path.setCellValueFactory(new PropertyValueFactory<Flight, String>("name"));
        Begin.setCellValueFactory(new PropertyValueFactory<Flight, String>("start"));
        End.setCellValueFactory(new PropertyValueFactory<Flight, String>("end"));
        BeginTime.setCellValueFactory(new PropertyValueFactory<Flight, String>("startTime"));
        EndTime.setCellValueFactory(new PropertyValueFactory<Flight, String>("endTime"));



        Table.setItems(list);
        int count = list.size();

        CountOfWrites.setText("" + count);

        AddBtn.setOnAction(event -> {
            System.out.println("Запись добавлена");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Новый рейс");
            alert.setHeaderText(null);
            alert.setContentText("Новый тестовый рейс добавлен");

            list.add(new Flight(list.size() + 1, "test", "test", "test", "test", "test", "test"));

            int count1 = list.size();

            CountOfWrites.setText("" + count1);

            alert.showAndWait();
        });

        FilterBtn.setOnAction(event -> {
            System.out.println("Применен фильтр");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Фильтр");
            alert.setHeaderText(null);
            alert.setContentText("Опции фильтра");

            alert.showAndWait();
        });

        ServiceBtn.setOnAction(event -> {
            System.out.println("Сервис выбран");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Сервис");
            alert.setHeaderText(null);
            alert.setContentText("Опции сервиса");

            alert.showAndWait();
        });

        DelBtn.setOnAction(event -> {
            System.out.println("Удаление рейса");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            TableView.TableViewSelectionModel<Flight> selectionModel = Table.getSelectionModel();
            System.out.println(selectionModel.getFocusedIndex());

            list.remove(selectionModel.getFocusedIndex());

            alert.setTitle("Удаление рейса");
            alert.setHeaderText(null);
            alert.setContentText("Рейс успешно удален");

            alert.showAndWait();
        });

        EditBtn.setOnAction(event -> {
            System.out.println("Выполнено редактирование рейса");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Редактировать рейс");
            alert.setHeaderText(null);
            alert.setContentText("Рейс редактирован");

            alert.showAndWait();
        });
    }
}

