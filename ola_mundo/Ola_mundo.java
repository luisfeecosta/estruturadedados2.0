
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ola_mundo;
import javax.swing.JOptionPane;
/**
 *
 * @author luisf
 */
public class Ola_mundo {
   
   
public static void main(String[] args) {
            //11
System.out.println("aprendendo algoritmo!!!");
            //12
System.out.println("com anita e guto");  
            //16
int x;
x = 10;
System.out.println(+x);

            //18
            
System.out.println("valor de x e"+(x+1));
            //23
int d,a;            
d = Integer.parseInt(JOptionPane.showInputDialog("digite um numero de tres casas"));        

a=(d%100/10);
System.out.println(+a);

            //25
            
     int data,dia,mes,ano,ndata;            
data = Integer.parseInt(JOptionPane.showInputDialog("digite a data no formato DDMMAA"));        
    dia= (data/10000);  
    mes=(data%10000/100);
    ano=(data%100);
System.out.println("\ndia"+dia);
System.out.println("\nmes"+mes);
System.out.println("\nano"+ano);

            //26
       ndata=mes *10000 +dia*100+ano ;
      System.out.println("\nformato mmddaa"+ndata);      
         //27
    int y,z;
    z = Integer.parseInt(JOptionPane.showInputDialog("digite z"));
    y = Integer.parseInt(JOptionPane.showInputDialog("digite y "));
     System.out.println("\nz"+z);
     System.out.println("\n y"+y);
    z++;
    y--;
     System.out.println("\nnovo valor de z"+z);
     System.out.println("\nnovo valor de y"+y);
         
            //31
    int ma;
    ma = (8+9+7)/3;
            System.out.println("\nmedia arritmetica e"+ma);   
            

                //40
      int quoc, rest, val1, val2; 
      val1 = Integer.parseInt(JOptionPane.showInputDialog("entre com o dividendo")); 
      val2 = Integer.parseInt(JOptionPane.showInputDialog("entre com o divisor"));           
      quoc = val1/val2;
      rest = val1%val2;
        System.out.println("\ndividendo"+val1);
        System.out.println("\ndivisor"+val2);
        System.out.println("\nquociente"+quoc);
        System.out.println("\nresto"+rest);
        
             //41
        int e,f,g,h,md;
         e = Integer.parseInt(JOptionPane.showInputDialog("entre com primeiro numero")); 
         f = Integer.parseInt(JOptionPane.showInputDialog("entre com segundo numero"));     
        g = Integer.parseInt(JOptionPane.showInputDialog("entre com terceiro numero")); 
        h = Integer.parseInt(JOptionPane.showInputDialog("entre com quarto numero")); 
        
        md=(e*1+f*2+g*3+h*4)/10;
         System.out.println("\nmedia ponderada"+md);
         
                //42
         double angulo,rang;
       angulo = Double.parseDouble(JOptionPane.showInputDialog("digite o angulo em graus"));    
       rang= angulo *Math.PI/180;   
       System.out.println("\nseno"+Math.sin(rang));
       System.out.println("\ncoseno"+Math.cos(rang));         
       System.out.println("\ntangente"+Math.tan(rang));
       System.out.println("\nco-secante"+1/Math.sin(rang));
       System.out.println("\nsecante"+1/Math.cos(rang));         
       System.out.println("\ncotangente"+1/Math.tan(rang));
       
                    //43
                    
        double numero,logaritmo;   
         numero = Double.parseDouble(JOptionPane.showInputDialog("entre com o logaritmando")); 
        logaritmo = Math.log(numero)/Math.log(10);
         System.out.println("\nlogaritmo"+logaritmo);
              //44
         double nume , base ,loga; 
          nume = Double.parseDouble(JOptionPane.showInputDialog("entre com o logaritmando do exc 44")); 
          base = Double.parseDouble(JOptionPane.showInputDialog("entre com a base")); 
          loga = Math.log(nume)/ Math.log(base); 
          System.out.println("\nlogaritmo deb"+nume+ "bna base"+base+ "be:b"+loga);
                  
                  //46
         double saldo,nsaldo;
         saldo = Double.parseDouble(JOptionPane.showInputDialog("entre com seu saldo"));
         nsaldo=saldo*1.01;
         System.out.println("\nnovo saldo"+nsaldo);
                //48
         double qtdade,sm,preco,vp,vd;    
          sm = Double.parseDouble(JOptionPane.showInputDialog("entre com salario minimo")); 
          qtdade = Double.parseDouble(JOptionPane.showInputDialog("entre com a quantidade de quilowatt"));
          preco = sm /700;
          vp = preco * qtdade; 
          vd = vp * 0.9;
          System.out.println("\npreco do quilowatt"+preco+ "valor a ser pago"+vp+ "valor com desconto"+vd);
        }
                
}

