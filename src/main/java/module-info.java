module edu.miracosta.cs112.lotaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.lotaria to javafx.fxml;
    exports edu.miracosta.cs112.lotaria;
}