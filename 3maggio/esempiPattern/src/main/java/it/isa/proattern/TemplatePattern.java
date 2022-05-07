package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

abstract class Engine{
    abstract void init();
    abstract void start();
    abstract void stop();

    public final void turnOn(){
        init();
        start();
        stop();
    }
}

class rocket extends Engine{
    public void init(){
        System.out.println("Init rocket");
    }

    public void start(){
        System.out.println("Start rocket");
    }

    public void stop(){
        System.out.println("Stop rocket");
    }
}

class car extends Engine{
    public void init(){
        System.out.println("Init car");
    }

    public void start(){
        System.out.println("Start car");
    }

    public void stop(){
        System.out.println("Stop car");
    }
}

public class TemplatePattern {
    public static void esegui(){
        System.out.println("TemplatePattern");
        Engine eng = new rocket();
        eng.turnOn();
        eng=new car();
        eng.turnOn();
    }
}
