package entities;
import java.util.Scanner;
public class Calculator {
  public  final double PI = 3.14;
  public static double L, R , r, D,  H , A, E, lt , igual , V , B;
  public static double raiz = Math.sqrt(3.0);
  public static Scanner number = new Scanner(System.in); 
  // Métodos e argumento para o cálculo
public  double alturaTriangulo(double lt, double Raiz3, double a3,double igual,double PI){
     System.out.print("qual é o Lado (l):  ");
       lt = number.nextDouble(); 
      igual = lt * raiz /2.0;
   System.out.printf("A altura do Triangulo equilátero é %.2f%n  " , igual );
     return igual ;
        }
public double areaTriangulo(Double B, Double H,double igual){
  System.out.println("Tamanho da Base: ");
  B = number.nextDouble();
  System.out.println("Tamanho da altura: ");
  H = number.nextDouble();
  igual = B * H/2;
  System.out.printf("A área do Triangulo é: %.2f%n ", igual);
  return igual;
}
public double areaCirculo(double R,double PI, double igual){
  System.out.println("Tamanho do raio: ");
  R = number.nextDouble();
  R = Math.pow(R, 2);
  igual = PI * R;
  System.out.printf("A area do Circulo é: %.2f%n",igual);
  return igual;
}
public double setorCiculo(double L, double R, double igual){
 System.out.println("Digitel a quantidade de lados:");
 L = number.nextDouble();
 System.out.println("Tamanho do Raio: ");
 R = number.nextDouble();
 igual = L * R;
 System.out.printf("A Área do Setor é: %.2f%n",igual);
 return igual;
}
public double volumeEsfera(double R, double PI, double igual){
  System.out.println("Diga o tamanho do Raio: ");
  R = number.nextDouble();
  R = Math.pow(R, 3);
  igual = 4 * PI * R/3;
  System.out.printf("O Volume da esfera é igual: %.2f%n ",igual);
  return igual;
}
public double areaEsfera(double R, double igual,double PI){
  System.out.println("Diga o tamanho do Raio: ");
  R = number.nextDouble();
  double R4 = Math.pow(R, 2);
  igual = 4 * PI * R4;
  System.out.printf("A Área da esfera é igual: %.2f%n ",igual);
  return igual;
}
public double lateralCilindro(double R,double H,double PI,double igual){
System.out.println("Tamanho do Raio do Cilindro: ");
R = number.nextDouble();
System.out.println("tamanho da altura do Cilindro:");
H = number.nextDouble();
igual = 2 * PI * R * H;
System.out.printf("A Área lateral do Cilindro é: %.2f%n",igual);
return igual;
}
public double volumeCilindro(double R,double H,double PI,double igual){
  System.out.println("tamanho da altura do Cilindro:");
H = number.nextDouble();
System.out.println("Tamanho do Raio do Cilindro: ");
R = number.nextDouble();
 double R4 = Math.pow(R , 2);
 igual = PI * R4 * H;
 System.out.println("O volume do Cilindro é de:");
 return igual;
}
public double areaTotalCilindro(double H, double R, double igual){
System.out.println("tamanho da altura do Cilindro:");
H = number.nextDouble();
System.out.println("Tamanho do Raio do Cilindro: ");
R = number.nextDouble();
igual =  2 * PI *(H + R);
System.out.printf("A área total do cilindro é igual a: %.2f%n ",igual);
  return igual;
}
public double areaLateralCone(double H, double d, double igual, double PI){
   System.out.println("Diga a altura do Cone: ");
   H = number.nextDouble();
   System.out.println("Digite o Diametro do Cone: ");
   D = number.nextDouble();
   igual = PI * R * D;
   System.out.printf("A area lateral do cone é: %.2f%n", igual);
   return igual;
}
public double areaTotalCone(double R, double H, double D, double igual, double PI){
System.out.println("Tamanho do Raio: ");
   R = number.nextDouble();
   System.out.println("Diga a altura do Cone: ");
   H = number.nextDouble();
   System.out.println("Digite o Diametro do Cone: ");
   D = number.nextDouble();
   igual = PI * R *(D+H);
   System.out.printf("A Área total do cone é igual a: %.2f%n ",igual);
   return igual;
}
public double volumeTroncoCone(Scanner scanner, double r, double R, double igual,double D, double PI){
  System.out.println("tamanho do Raio menor(r): ");
  r = number.nextDouble();
  System.out.println("Tamanho do Raio maior(R): ");
  R = number.nextDouble();
  System.out.println("Volume do Diamentro: ");
  D = number.nextDouble();
 
  double r4 = Math.pow(r , 2);
  double R4 = Math.pow(R , 2);
  igual = (PI*D/2) * (r4 + r * R + R4);
  System.out.printf("O volume do Tronco do Cone é ",igual);
  return igual;
}
public double volumeCone(Scanner scanner , double E, double R , double H , double PI, double igual ){
System.out.println("Diga o tamanho do r");
E = number.nextDouble();
R = Math.pow( E , 2);
System.out.println("Diga a altura do Cone");
H = number.nextDouble();
 igual = PI * R * H/3;
 System.out.printf("O volume do cone é igual %.2f%n", igual);
 return igual;
      }
}
