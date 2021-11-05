module com.example.testmaven2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testmaven2 to javafx.fxml;
    exports com.example.testmaven2;
}