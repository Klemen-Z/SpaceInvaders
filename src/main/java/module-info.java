module com.ptsd.spaceinvaders {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens com.ptsd.spaceinvaders to javafx.fxml;
    exports com.ptsd.spaceinvaders;
}