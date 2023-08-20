module ru.yandex.practikum.yps8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.qameta.allure.commons;
    requires rest.assured;
    requires org.hamcrest;
    requires junit;
    requires io.qameta.allure.junit4;


    opens ru.yandex.practikum.yps8 to javafx.fxml;
    exports ru.yandex.practikum.yps8;
}