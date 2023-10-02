package ex_basicos;

import exercise.*;
import ui.IO;

public class Exercise3 extends Exercise {
    {
        setExerciseName("Exercise 3");
        setDescription("""
Crea las variables nombre, direccion y telefono y asígnale los valores corres- pondientes.
Muestra
los valores de esas variables por pantalla de tal forma que el resultado del programa sea el mismo
que en el ejercicio 2.""");
    }
    private String name = "Maurice Darner";
    private String address = "Calle Corrdera 42";
    private String phone = "686-336-555";

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

