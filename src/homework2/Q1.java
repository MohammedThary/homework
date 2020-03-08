/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wwwmo
 */
public class Q1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ListView<String> firstList = new ListView<>();
        ListView<String> secondtList = new ListView<>();
        firstList.getSelectionModel()
                .setSelectionMode(SelectionMode.MULTIPLE);
       
        Button copy = new Button("Copy>>>");
        
        firstList.getItems().addAll("Ahmed", "mohammed", "Amer", "omar",
                 "mo", "kage", "eww", "ere", "esw", "sav", "sdv",
                "abood" + "yhya" , "azooz");

        copy.setOnAction((ActionEvent event) -> {
            ObservableList<String> copyitem = firstList.getSelectionModel()
                    .getSelectedItems();
            if (copyitem.isEmpty()) {
                Alert a = new Alert(AlertType.NONE);
                a.setAlertType(AlertType.WARNING);
                a.setHeaderText("there is no item select !!");
                a.setContentText("Please select an item");
                a.show();
            } else {

              secondtList.getItems().addAll(copyitem);
            }

        });

        HBox root = new HBox(10, firstList, copy, secondtList);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Multiple Selection Lists");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
