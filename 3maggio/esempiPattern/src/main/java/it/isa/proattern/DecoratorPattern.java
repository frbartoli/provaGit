package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

interface NewEngine{
    void run();
}

class NewCar implements NewEngine{
    public void run(){
        System.out.println("The car is running");
    }
}

class NewRocket implements NewEngine{
    public void run(){
        System.out.println("The rocket is running");
    }
}

abstract class EngineDecorator implements NewEngine{
    NewEngine decoratedEngine;

    public EngineDecorator(NewEngine e){
        decoratedEngine=e;
    }

    public void run(){
        decoratedEngine.run(); //Questa può chiamare una funzione astratta...
    }
}

class BustedEngineDecorator extends EngineDecorator{
    public BustedEngineDecorator(NewEngine engine){
       super(engine); 
    }

    private void boostIt(){
        System.out.println("boosted");
    }

    public void run(){
        decoratedEngine.run();
        boostIt();
    }
}

public class DecoratorPattern {
    public static void esegui(){
        System.out.println("Decorator pattern");
        NewEngine e = new NewCar();
        e.run();
        e=new NewRocket();
        e.run();
        NewEngine boostedCar=new BustedEngineDecorator(new NewCar());
        boostedCar.run();
        NewEngine boostedRocket=new BustedEngineDecorator(new NewRocket());
        boostedRocket.run();
    }
}