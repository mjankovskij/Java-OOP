package Exceptions.firstTask;

public class A {

    public void metodas0(){
        try {
            B b = new B();
            b.metodas1();
        }catch(RuntimeException e){
            System.out.println("Klaseje Exceptions.firstTask.A pagauta " + e);
        }
    }
}
