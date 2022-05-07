package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

interface StrategyInterface{
    public String doOp(String s);
}

public class StrategyInterfaceA {
    public static void esegui(){
        System.out.println("StrategyInterfaceA, classi anonime");

        String s="pRoVa";

        StrategyInterface siLower=new StrategyInterface(){ //Classe anonia
            public String doOp(String s){
                return s.toLowerCase();
            }
        };

        StrategyInterface siUpper=new StrategyInterface(){ //Classe anonia
            public String doOp(String s){
                return s.toUpperCase();
            }
        };

        StrategyInterface siCapitalize=new StrategyInterface(){ //Classe anonia
            public String doOp(String s){
                return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            }
        };

        System.out.println(siLower.doOp(s));
        System.out.println(siUpper.doOp(s));
        System.out.println(siCapitalize.doOp(s));
    }
}
