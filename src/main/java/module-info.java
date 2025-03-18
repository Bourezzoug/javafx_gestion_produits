module com.example.productmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.productmanager to javafx.fxml;
    exports com.example.productmanager;
}
