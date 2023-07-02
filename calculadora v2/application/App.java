package application;

import java.util.Scanner;

import entities.Calculator;
public class App {
public static double lt;
public static double igual;
public static int rep;
public static int resp;
public static void main(String args[]) {
 do{
  Scanner sc = new Scanner(System.in);     


    Calculator calculator = new Calculator();

    
      System.out.println("----------------------------------------------");
       System.out.println("1 = Altura do triangulo equilátero");
       System.out.println("2 = Área do triangulo equilátero");
       System.out.println("");
       System.out.println("----------------------------------------------");
       System.out.println("3 = Área do Círculo");
       System.out.println("4 = Área do Setor do Círculo");
       System.out.println("----------------------------------------------");
       System.out.println("5 = Volume da Esfera");
       System.out.println("6 = Área da Esfera");
       System.out.println("7 = Area total do ciruculo");
       System.out.println("----------------------------------------------");
       System.out.println("8 = Área lateral do Cilindo");
       System.out.println("9 = Volume do Cilindro");
       System.out.println("10 = Área total dos cilindros");
       System.out.println("----------------------------------------------");
       System.out.println("11 = Área lateral do Cone");
       System.out.println("12 = Área total do Cone");
       System.out.println("13 = Volume to Tronco do Cone ");
       System.out.println("14 = Volume do Cone ");
       System.out.println("----------------------------------------------");
       System.out.println("Oque voce gostaria de calcular?");
        resp = sc.nextInt();
       
       
       
      switch(resp){
        case 1:
       calculator.alturaTriangulo(lt, resp, resp, lt, resp);
       break;
       case 2:
       calculator.areaTriangulo(null, null, resp);
       break;
       case 3:
       calculator.areaCirculo(resp, resp, igual);
       break;
       case 4:
       calculator.setorCiculo(resp, resp, resp);
       break;
       case 5:
       calculator.volumeEsfera(resp, resp, resp);
       break;
       case 6:
      calculator.areaEsfera(resp, resp, resp);
       break;
       case 7:
       calculator.areaCirculo(resp, resp, resp);
       break;
       case 8:
       calculator.lateralCilindro(resp, resp, resp, resp);
       break;
       case 9:
       calculator.areaTotalCilindro(resp, resp, resp);
       break;
       case 10:
       calculator.areaTotalCilindro(resp, resp, resp);
       break;
       case 11:
       calculator.areaLateralCone(resp, resp, resp, resp);
       break;       
       case 12:
       calculator.areaTotalCone(resp, resp, resp, resp, igual);
       break;
       case 13:
       calculator.volumeTroncoCone(sc, resp, resp, resp, resp, igual);
       break;
       case 14: 
       calculator.volumeCone(sc, resp, resp, resp, resp, resp);
      break;
      default:
      System.out.println("Opção inválida, tente novamente");
        
       }




   } while (resp < 1 || resp > 14);

}  
}

      
   
