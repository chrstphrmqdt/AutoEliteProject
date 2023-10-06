module com.example.autoeliteproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.autoeliteproject to javafx.fxml;
    exports com.example.autoeliteproject;

}