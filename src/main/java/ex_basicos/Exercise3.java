package ex_basicos;

import Exercise.*;
import ui.IO;

public class Exercise3 extends Exercise {

    private String name = "Maurice Darner";
    private String address = "Calle Corrdera 42";
    private String phone = "686-336-555";

    String exerciseName = "Exercise 3";
    String description = "Crea las variables nombre, direccion y telefono y asígnale los valores corres- pondientes.";
    String question = """
            Muestra
            los valores de esas variables por pantalla de tal forma que el resultado del programa sea el mismo
            que en el ejercicio 2.
            """;

    public Exercise3(IO io) {
        super(io);
    }

    @Override
    public void run() {
        this.io.write(String.format("""
                        Name = %s
                        Address = %s
                        Phone = %s
                        """
                , name, address, phone));
    }
}

