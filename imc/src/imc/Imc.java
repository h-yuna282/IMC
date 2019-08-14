/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author CBN
 */
public class Imc {

  public Imc (){

    }
  

  public double resultadoImc(double peso,double estatura){
     double resultado = peso/Math.pow(estatura,2);
     return resultado;
  }
  
     public String  obsImc(double Imc) {
         String diagnostico="";
         if(Imc<15){
         diagnostico ="delgadez muy severa";
         } else if (Imc <15.9){
           diagnostico ="delgadez severa";
         }
     else if (Imc <18.4){
           diagnostico ="Delgadez";
         }else if (Imc <24.9){
           diagnostico ="peso saludable";
        }else if (Imc <30){
           diagnostico ="sobrepeso";
        }else if (Imc <40){
           diagnostico ="obesidad severa";
        }else{
           diagnostico ="Obesidad morvida y perturvadora";
        }   
            
     
         return diagnostico;
     
     }
}
               
    

