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
import java.util.regex.Pattern;
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
        
        Label nameCourseIdLabel = new Label("Course Id:");
        TextField nameCourseIdTextField = new TextField();
        nameCourseIdTextField.setPrefHeight(30);

        Label nameCourseLabel = new Label("Name of Course:");
        TextField nameCourseTextField = new TextField();
        nameCourseTextField.setPrefHeight(30);
        
        //set Color button and handle hover
        String originalStyle = "-fx-background-color: #1FA2FF; -fx-text-fill: white; -fx-padding: 10px 20px; -fx-font-size: 15px; -fx-cursor: hand;";
        Button registerButton = new Button("Register");
        registerButton.setStyle(originalStyle);
        registerButton.setOnMouseEntered(event -> {
           registerButton.setStyle("-fx-background-color: #00CDAC; -fx-text-fill: black; -fx-padding: 10px 20px;-fx-font-size: 15px; -fx-cursor: hand;");
        });
        
        registerButton.setOnMouseExited(event -> {
           registerButton.setStyle(originalStyle);
        });
        
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
        gridPane.add(nameCourseIdLabel, 0, 3);
        gridPane.add(nameCourseIdTextField, 1, 3);
        gridPane.add(nameCourseLabel, 0, 4);
        gridPane.add(nameCourseTextField, 1, 4);
        gridPane.add(registerButton, 1, 4);
        
        HBox buttonBox = new HBox(registerButton);
        buttonBox.setPadding(new Insets(10));
        buttonBox.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.add(buttonBox, 0, 5, 2, 1);

        // handle event
        registerButton.setOnAction(event -> {
            String name = standardName(nameTextField.getText());
            String email = emailTextField.getText();
            String nameCourse = nameCourseTextField.getText();
            String nameCourseId = nameCourseIdTextField.getText();
            
//            checkEmail(email);
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            boolean isValidEmail = Pattern.matches(emailRegex, email);
            if (isValidEmail) {
                System.out.println("Email is valid");
            } else {
                System.out.println("Email is invalid");

                // Hiển thị cảnh báo
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Invalid Email");
                alert.setHeaderText(null);
                alert.setContentText("The email address is invalid. Please enter a valid email address.");
                alert.showAndWait();
                return;
            }
            
            if (nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty()
                    || nameCourseTextField.getText().isEmpty() ||nameCourseIdTextField.getText().isEmpty()) {
                showErrorMessage("Vui lòng điền đầy đủ thông tin!");
                return;
            }
            
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
            
            //register
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
    
//    private void checkEmail(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
//        boolean isValidEmail = Pattern.matches(emailRegex, email);
//        if (isValidEmail) {
//            System.out.println("Email is valid");
//        } else {
//            System.out.println("Email is invalid");
//
//            // Hiển thị cảnh báo
//            Alert alert = new Alert(AlertType.WARNING);
//            alert.setTitle("Invalid Email");
//            alert.setHeaderText(null);
//            alert.setContentText("The email address is invalid. Please enter a valid email address.");
//            alert.showAndWait();
//        }
//    }

    private String standardString(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

    private String standardName(String str) {
            String[] arr = str.split("\\s+");
            String res = "";
            for (String x : arr) {
                    res += standardString(x) + " ";
            }
            str = res.substring(0, res.length() - 1);
            return str;
    }

    private void showErrorMessage(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}