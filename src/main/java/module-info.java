module com.example.sklep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sklep to javafx.fxml;
    exports com.example.sklep;
    exports Reczy;
    opens Reczy to javafx.fxml;
}