module com.calculator.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.demo2 to javafx.fxml;
    exports com.calculator.demo2;
}