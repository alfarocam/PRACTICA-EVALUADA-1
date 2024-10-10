/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Camila Alfaro Rivera
        System.out.print("Bienvenido!!");
        
        //Se pide la cantidad de empleados
        String CantString = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        
        //Se pasa de string a int
        int CANT = Integer.parseInt(CantString);
        
        //declaramos todas la variables que se van a utilizar
        double Total;
        double SumaSalario=0;
        double SEM = 27.750;
        double IVM = 15.240;
        //Creamos el for para preguntar X cantidad de veces el salario
        for (int i = 0; i <= CANT; i++) {
            String SalarioString = JOptionPane.showInputDialog("Ingrese el salario del empleado:");
            double Salario = Integer.parseInt(SalarioString);
            SumaSalario+=Salario;
        }
        double SemTotal = SumaSalario*SEM;
        double IvmTotal= SumaSalario*IVM;
        Total=SemTotal+IvmTotal;
        System.out.print("La empresa debera abonar a la CCSS el monto total por IVM y SEM"+Total);
        }
    }
