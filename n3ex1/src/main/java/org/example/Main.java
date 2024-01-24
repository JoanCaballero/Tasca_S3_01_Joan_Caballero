package org.example;

import org.example.Commands.Command;
import org.example.Commands.CommandAccelerar;
import org.example.Commands.CommandArrencar;
import org.example.Commands.CommandFrenar;
import org.example.Vehicles.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle avio = new Avio();
        Vehicle bicicleta = new Bicicleta();
        Vehicle cotxe = new Cotxe();
        Vehicle vaixell = new Vaixell();
        ArrayList<Command> commands = new ArrayList<>();
        Command arrencaAvio = new CommandArrencar(avio);
        commands.add(arrencaAvio);
        Command arrencaBicicleta = new CommandArrencar(bicicleta);
        commands.add(arrencaBicicleta);
        Command arrencaCotxe = new CommandArrencar(cotxe);
        commands.add(arrencaCotxe);
        Command arrencaVaixell = new CommandArrencar(vaixell);
        commands.add(arrencaVaixell);
        Command acceleraAvio = new CommandAccelerar(avio);
        commands.add(acceleraAvio);
        Command acceleraBicicleta = new CommandAccelerar(bicicleta);
        commands.add(acceleraBicicleta);
        Command acceleraCotxe = new CommandAccelerar(cotxe);
        commands.add(acceleraCotxe);
        Command acceleraVaixell = new CommandAccelerar(vaixell);
        commands.add(acceleraVaixell);
        Command frenaAvio = new CommandFrenar(avio);
        commands.add(frenaAvio);
        Command frenaBicicleta = new CommandFrenar(bicicleta);
        commands.add(frenaBicicleta);
        Command frenaCotxe = new CommandFrenar(cotxe);
        commands.add(frenaCotxe);
        Command frenaVaixell = new CommandFrenar(vaixell);
        commands.add(frenaVaixell);

        Invoker invoker = new Invoker(commands);
        invoker.execute();
    }
}