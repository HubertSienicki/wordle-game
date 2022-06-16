module com.example.wordlegame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.wordlegame to javafx.fxml;
    exports com.example.wordlegame;
}