package javaapplication1;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        
     Auto auto1 = new Auto ();
     Auto auto2 = new Auto (1, "AA111JO", 5, "rojo", true);
     
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());

        
     auto2.encender();
     auto2.acelerar(60);
     auto2.frenar(30);
     auto2.apagar();
     
        System.out.println("El valor de la Id es: " + auto2.getId());
        auto2.setId(35000);
        System.out.println("El nuevo valor de la Id es: " + auto2.getId());
    }
    
}
