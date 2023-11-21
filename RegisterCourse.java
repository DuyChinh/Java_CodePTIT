/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

/**
 *
 * @author DuyChinhPro
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Registration Form");
        
        Label titleLabel = new Label("Register Course Form");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: black;");
        // Create UI element
        Label nameLabel = new Label("Fullname:");
        TextField nameTextField = new TextField();
        nameTextField.setPrefWidth(300);
        nameTextField.setPrefHeight(30);

        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();
        emailTextField.setPrefHeight(30);

        Label nameCourseLabel = new Label("Course:");
        TextField nameCourseTextField = new TextField();
        nameCourseTextField.setPrefHeight(30);

        Button registerButton = new Button("Register");

        
        // Create Grid to contain UI element
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(35, 50, 40, 50));
        gridPane.setVgap(10);
        gridPane.setHgap(5);

        // set Ui elemrnt in Grid
        gridPane.add(titleLabel, 0, 0, 2, 1);
        GridPane.setColumnSpan(titleLabel, 2);
        GridPane.setHalignment(titleLabel, javafx.geometry.HPos.CENTER);
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameTextField, 1, 1);
        gridPane.add(emailLabel, 0, 2);
        gridPane.add(emailTextField, 1, 2);
        gridPane.add(nameCourseLabel, 0, 4);
        gridPane.add(nameCourseTextField, 1, 4);

        
        HBox buttonBox = new HBox(registerButton);
        buttonBox.setPadding(new Insets(10));
        buttonBox.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.add(buttonBox, 0, 5, 2, 1);

        // handle event
        registerButton.setOnAction(event -> {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String nameCourse = nameCourseTextField.getText();
            String nameCourseId = nameCourseIdTextField.getText();

            //Check field
             if (nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty()
                    || nameCourseTextField.getText().isEmpty() ||nameCourseIdTextField.getText().isEmpty()) {
                showErrorMessage("Vui lòng điền đầy đủ thông tin!");
                return;
            }
            
	    //Write in Excel(csv)
              try {
            String filename = "student.csv";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));

            writer.write(name + "," + email + "," + nameCourseId+","+nameCourse);
            writer.newLine();
            writer.close();

            System.out.println("Write successful " + filename);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
            
            // Register
            System.out.println("Register Successful!");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("name of Course: " + nameCourse);
            
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Notification");
            alert.setHeaderText(null);
            alert.setContentText("Register successful!");
            alert.showAndWait();
        });
        

        Scene scene = new Scene(gridPane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



    private void showErrorMessage(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}