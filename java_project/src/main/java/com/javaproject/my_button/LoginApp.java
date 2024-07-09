package com.javaproject.my_button;
import javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        AnchorPane main = new AnchorPane();

        AnchorPane studentAnchorPane = new AnchorPane();
        AnchorPane facultyAnchorPane = new AnchorPane();

        studentAnchorPane.setPrefSize(500,350);
        facultyAnchorPane.setPrefSize(500,350);

        studentAnchorPane.setStyle("-fx-border-radius:50;-fx-border-radius: 10; -fx-border-color: black; -fx-border-width:5 2px;;-fx-background-color:whight;");
        facultyAnchorPane.setStyle("-fx-border-radius:50;-fx-border-radius: 10; -fx-border-color: black; -fx-border-width:5 2px;-fx-background-color:whight;");  
      
        AnchorPane.setLeftAnchor(studentAnchorPane,400.0);
  
        AnchorPane.setTopAnchor(studentAnchorPane,300.0);


        AnchorPane.setLeftAnchor(facultyAnchorPane,950.0);

        AnchorPane.setTopAnchor(facultyAnchorPane,300.0);


        Label studentLogin = new Label("🎓Student Login🎓");
         studentLogin.setTextFill(Color.BLACK);
         studentLogin.setFont(new Font(50));

        AnchorPane.setLeftAnchor(studentLogin,50.0);
        AnchorPane.setTopAnchor(studentLogin,1.0);

        Label facultylogin = new Label("👨🏼‍🏫Teacher Login👨🏼‍🏫");
        facultylogin.setTextFill(Color.BLACK);
        facultylogin.setFont(new Font(50));
        AnchorPane.setLeftAnchor(facultylogin,50.0);

        AnchorPane.setTopAnchor(facultylogin,1.0);
        
        Label usernameLabel = new Label("Username:");
        usernameLabel.setStyle("-fx-text-fill:Black");
        usernameLabel.setFont(new Font(20));
        AnchorPane.setLeftAnchor(usernameLabel,100.0);
        AnchorPane.setTopAnchor(usernameLabel,100.0);

        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Enter your username");
        usernameInput.setStyle("-fx-text-fill:black");
        AnchorPane.setLeftAnchor(usernameInput,200.0);
        AnchorPane.setTopAnchor(usernameInput,100.0);

        Label usernameLabelfa = new Label("Username:");
        usernameLabelfa.setFont(new Font(20));
        usernameLabelfa.setStyle("-fx-text-fill:black");
        AnchorPane.setLeftAnchor(usernameLabelfa,100.0);
        AnchorPane.setTopAnchor(usernameLabelfa,100.0);

        TextField usernameInputfa = new TextField();
        usernameInputfa.setPromptText("Enter your username");
        AnchorPane.setLeftAnchor(usernameInputfa,200.0);
        AnchorPane.setTopAnchor(usernameInputfa,100.0);
        
        Label passwordLabel = new Label("Password:");
        passwordLabel.setStyle("-fx-text-fill:black");
        passwordLabel.setFont(new Font(20));
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Enter your password");

        Label passwordLabelfa = new Label("Password:");
        passwordLabelfa.setStyle("-fx-text-fill:black");
        passwordLabelfa.setFont(new Font(20));
        PasswordField passwordInputfa = new PasswordField();
        passwordInputfa.setPromptText("Enter your password");

        AnchorPane.setLeftAnchor(passwordLabelfa,100.0);
        AnchorPane.setTopAnchor(passwordLabelfa,200.0);

        AnchorPane.setLeftAnchor(passwordLabel,100.0);
        AnchorPane.setTopAnchor(passwordLabel,200.0);
        AnchorPane.setLeftAnchor(passwordInputfa,200.0);
        AnchorPane.setTopAnchor(passwordInputfa,200.0);

        AnchorPane.setLeftAnchor(passwordInput,200.0);
        AnchorPane.setTopAnchor(passwordInput,200.0);


        Button loginButton = new Button(" student Login");
        AnchorPane.setLeftAnchor(loginButton,200.0);
        AnchorPane.setTopAnchor(loginButton,300.0);
        loginButton.setStyle("-fx-text-fill:black ");
        

        Button loginButtonfa = new Button("Login");
        AnchorPane.setLeftAnchor(loginButtonfa,200.0);
        AnchorPane.setTopAnchor(loginButtonfa,300.0);

        Label remberMeLabel = new Label("Remember Me:");
        remberMeLabel.setFont(new Font(15));
        remberMeLabel.setStyle("-fx-text-fill:black");
        AnchorPane.setLeftAnchor(remberMeLabel,220.0);
        AnchorPane.setTopAnchor(remberMeLabel,250.0);

        CheckBox remebermeChechBox = new CheckBox();
        AnchorPane.setLeftAnchor(remebermeChechBox,200.0);
        AnchorPane.setTopAnchor(remebermeChechBox,250.0);

        Label remberMeLabelfa = new Label("Remember Me:");
        remberMeLabelfa.setFont(new Font(15));
        remberMeLabelfa.setStyle("-fx-text-fill:black");
        AnchorPane.setLeftAnchor(remberMeLabelfa,200.0);
        AnchorPane.setTopAnchor(remberMeLabelfa,250.0);

        CheckBox remebermeChechBoxfa = new CheckBox();
        AnchorPane.setLeftAnchor(remebermeChechBoxfa,180.0);
        AnchorPane.setTopAnchor(remebermeChechBoxfa,250.0);

        AnchorPane bottomAnchorPane = new AnchorPane();
        AnchorPane.setTopAnchor(bottomAnchorPane,550.0);

        Label noAccounrLabel = new Label("Don't have an account ?");
        noAccounrLabel.setStyle("-fx-text-fill:red");
        AnchorPane.setLeftAnchor(noAccounrLabel,900.0);
        AnchorPane.setTopAnchor(noAccounrLabel,120.0);
        

        Button signUpbutton = new Button("Sign Up");
     
     

        AnchorPane.setLeftAnchor(signUpbutton,925.0);
        AnchorPane.setTopAnchor(signUpbutton,140.0);

        
        Button forgotPassButton = new Button("Forgot password");
        AnchorPane.setLeftAnchor(forgotPassButton,910.0);
        AnchorPane.setTopAnchor(forgotPassButton,180.0);

        // Add everything to grid
        facultyAnchorPane.getChildren().addAll(remberMeLabelfa,remebermeChechBoxfa, facultylogin, usernameLabelfa, usernameInputfa,passwordLabelfa, passwordInputfa, loginButtonfa);
        studentAnchorPane.getChildren().addAll(remebermeChechBox,remberMeLabel, studentLogin, usernameLabel, usernameInput,passwordLabel, passwordInput, loginButton);
        bottomAnchorPane.getChildren().addAll(forgotPassButton,noAccounrLabel,signUpbutton);
        main.getChildren().addAll( studentAnchorPane,facultyAnchorPane,bottomAnchorPane);

 
        loginButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();

          
        });

            Image image1 = new Image("LLL1.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(
                image1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(0, 0, true, true, true, true));

        Background background = new Background(backgroundImage);
        main.setBackground(background);

        Scene scene = new Scene(main, 1900, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private boolean validateStudentCredentials(String username, String password) {
      
        return username.equals("student") && password.equals("password");
    }

    private boolean validateFacultyCredentials(String username, String password) {
    
        return username.equals("faculty") && password.equals("password");
    }
}

//}