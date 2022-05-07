package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

interface Strategy{
    public String doOp(String s);
}

class ConvertLowerCase implements Strategy{
    public String doOp(String s){
        return s.toLowerCase();
    }
}

class ConvertUpperCase implements Strategy{
    public String doOp(String s){
        return s.toUpperCase();
    }
}

class Capitalize implements Strategy{
    public String doOp(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}

class Context{
    private Strategy strategy;

    public Context(Strategy s){
        strategy=s;
    }

    public String doOp(String s){
        return strategy.doOp(s);
    }
}

public class StrategyPattern {
    public static void esegui(){
        System.out.println("StrategyPattern");
        String s="benVENuto";
        Context c=new Context(new ConvertLowerCase());
        System.out.println(c.doOp(s));
        c=new Context(new ConvertUpperCase());
        System.out.println(c.doOp(s));
        c=new Context(new Capitalize());
        System.out.println(c.doOp(s));
    }
}
