/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        
        
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        if (c.getSaldo()!= cantidadEsperada) {
            throw new Exception("La cantidad esperada no coincide con el saldo actual");
        }
        CCuenta cuenta = new CCuenta("Juan López", "1234567890", 1000, 0);
         try {
            cuenta.ingresar(-500);
       } catch (Exception e){
        System.out.println("Ha ocurrido un error al ingresar: " + e.getMessage());
        }
       }
    
    
   public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.retirar(cantidad);
        if (c.getSaldo()!=cantidadEsperada) {
           throw new Exception("La cantidad esperadda no coincide con el saldo actual");
       }
        CCuenta cuenta = new CCuenta("Juan López", "1234567890", 1000, 0);
        try {
        cuenta.retirar(-500);
        }catch (Exception e) {
        System.out.println("Ha ocurrido un error al retirar: " + e.getMessage());
        }
        
    }
    
    
}
