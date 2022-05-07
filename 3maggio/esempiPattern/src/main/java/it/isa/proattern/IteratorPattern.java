package it.isa.proattern;

//In teoria bisognerebbe inserire un file per ogni interfaccia/classe del design pattern, qui facciamo tutto in un file.

interface MyIterator{
    void rewind(); //riporta il cursore all' inizio
    int nextElement();
    boolean hasNextElement();
}

interface MyCollection{
    public MyIterator getIter();
}

class MyListArray implements MyCollection{
    public int[] lista;

    public MyListArray(int n){
        lista=new int[n];

        for(int i=0; i<n; i++){
            lista[i]=i*10;
        }
    }

    public MyIterator getIter(){
        return new MyListIterator(this);
    }
}

class MyListIterator implements MyIterator{
    private int index=-1;
    private int[] lista;

    public MyListIterator(MyListArray la){
        lista=la.lista;
    }

    public void rewind(){
        index=-1;
    }

    public int nextElement(){
        index++;
        return lista[index];
    }

    public boolean hasNextElement(){
        return index<lista.length-1;
    }
}

public class IteratorPattern {
    public static void esegui(){
        System.out.println("IteratorPattern");
        System.out.println("Iterator pattern");
        MyCollection la=new MyListArray(10);
        MyIterator li=la.getIter();

        while(li.hasNextElement())
            System.out.println("Element: "+ li.nextElement());
    }
}//I metodi saranno sempre uguali indiepndentemente dal tipo di dato
