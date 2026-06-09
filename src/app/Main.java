package app;

import model.Direccion;
import model.GuiaTuristico;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Avenida Costanera 123", "Llanquihue", "Los Lagos");

        Direccion direccion2 = new Direccion("Calle del Lago 456","Puerto Varas","Los Lagos"
        );

        Direccion direccion3 = new Direccion("Ruta 5 Sur Km 1000","Frutillar","Los Lagos"
        );

        List<String> idiomas = new ArrayList<>();

        idiomas.add("Español");
        idiomas.add("Inglés");

        GuiaTuristico guia1 = new GuiaTuristico(
                "Joaquín Gutiérrez",
                "12.345.678-1",
                "+569 98766533",
                direccion1,
                "Especializado en flora y fauna local.",
                idiomas);

        GuiaTuristico guia2 = new GuiaTuristico(
                "María Soto",
                "11.222.333-4",
                "+56911111111",
                direccion2,
                "Especialista en turismo cultural.",
                List.of("Español", "Francés")
        );

        GuiaTuristico guia3 = new GuiaTuristico(
                "Carlos Pérez",
                "22.333.444-5",
                "+56922222222",
                direccion3,
                "Experto en excursiones.",
                List.of("Español", "Alemán")
        );

        System.out.println(guia1);
        System.out.println(guia2);
        System.out.println(guia3);
    }
}