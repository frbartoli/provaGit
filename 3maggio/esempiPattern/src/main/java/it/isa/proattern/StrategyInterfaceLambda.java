package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

interface StrategyIntLambda{
    public String doOp(String s);
}

public class StrategyInterfaceLambda {

    public static void esegui(){
        System.out.println("Strategy pattern con Lambda expressions");
        String s="pRoVa";

        StrategyIntLambda siLowerLambda = stringa -> stringa.toLowerCase();
        StrategyIntLambda siUpperLambda = stringa -> stringa.toUpperCase();
        StrategyIntLambda siCapitalize = stringa -> stringa.substring(0, 1).toUpperCase() + stringa.substring(1).toLowerCase();
        System.out.println(siLowerLambda.doOp(s));
        System.out.println(siUpperLambda.doOp(s));
        System.out.println(siCapitalize.doOp(s));
    }
}
