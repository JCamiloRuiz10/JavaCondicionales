
package app;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
         //EJERCICIOS CONDICIONALES
//        //1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese su Edad: ");
//        int edad = sc.nextInt();
//        System.out.println("Digite su ingreso Anual: ");
//        int sueldo = sc.nextInt();
//        System.out.println("Ingrese su puntuacion crediticia: ");
//        int puntos = sc.nextInt();
//        String credito = (edad >= 25 && sueldo >=50000000 && puntos >= 700) ? "Elegible": "No elegible";
//        System.out.println(credito);


//        //2
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Ingrese numero de pasajeros: ");
//        int pasajeros = sc2.nextInt();
//        sc2.nextLine();
//        System.out.println("Ingrese medio de Transporte: ");
//        String medio = sc2.nextLine();
//        int coche = 500 * 1500;
//        int autobus = 500 * 900;
//        int avion = 500 * 3000;
//        
//        if (medio.equals("coche")) {
//            if (pasajeros >= 3) {
//                int pago = coche * pasajeros;
//                double descuento = pago * 0.1;
//                double pagoFinal = pago - descuento;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pagoFinal);
//            } else {
//                int pago = coche * pasajeros;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pago);
//            }
//        } else if(medio.equals("autobus")){
//            if (pasajeros >= 3) {
//                int pago = autobus * pasajeros;
//                double descuento = pago * 0.1;
//                double pagoFinal = pago - descuento;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pagoFinal);
//            } else {
//                int pago = autobus * pasajeros;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pago);
//            }       
//        } else if(medio.equals("avion")){
//            if (pasajeros >= 3) {
//                int pago = avion * pasajeros;
//                double descuento = pago * 0.1;
//                double pagoFinal = pago - descuento;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pagoFinal);
//            } else {
//                int pago = avion * pasajeros;
//                System.out.println("El pago de " + pasajeros + " pasajeros en " + medio + " es de: " + pago);
//            }       
//        } else {
//            System.out.println("Dato no valido");
//        }

//        //3
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Ingrese su promedio: ");
//        double promedio = sc3.nextInt();
//        System.out.println("Numero de participacion en Actividades: ");
//        int actividades = sc3.nextInt();
//        System.out.println("Digite ingresos familiares: ");
//        int ingresos = sc3.nextInt();
//        String beca = (promedio >=85 && actividades >=3 && ingresos < 30000000) ? "Es elegible a la Beca" : "No es elegible";
//        System.out.println(beca);

//        //4
//        Scanner cs4 = new Scanner(System.in);
//        System.out.println("Iniciar Sesion");
//        String sesion = cs4.nextLine();
//        if (sesion.equals("Si")) {
//                System.out.println("Rol");
//                String rol = cs4.nextLine();
//            if (rol.equals("Admin")) {
//                System.out.println("Usted es Administrador");
//            } else if(rol.equals("Usuario")){
//                System.out.println("Usted es usuario");
//            }
//        } else if (sesion.equals("No")) {
//            System.out.println("Usted es visitante");
//        }

//        //5
//        Scanner cs5 = new Scanner(System.in);
//        System.out.println("Capital disponible: ");
//        int capital = cs5.nextInt();
//        System.out.println("Tasa de retorno esperada en %: ");
//        int tasa = cs5.nextInt();
//        System.out.println("Riesgos asociados en %: ");
//        int riesgos = cs5.nextInt();
//        String inversion = (capital > 100000000 && tasa>= 10 && riesgos <20) ? "Su inversion es Viable" : "La inversion NO es viable";
//        System.out.println(inversion);

//        //6
//        int salario = 4000000;
//        double impuestos = salario * 0.2;
//        double seguridad = salario * 0.05;
//        double salarioFinal = salario - impuestos - seguridad - 200000;
//        System.out.println("El Salario Neto del empleado es: " + salarioFinal);

//        //7
//        Scanner sc6 = new Scanner(System.in);
//        System.out.println("Ingrese Nivel de Urgencia (1.Critica  2.Alta 3.Baja): ");
//        int urgencia = sc6.nextInt();
//        System.out.println("Ingrese el Impacto (1.Alto 2.Medio 3.Bajo): ");
//        int impacto = sc6.nextInt();
//        int nivel = (urgencia + impacto)/2;
//        if (nivel == 3) {
//            System.out.println("Prioridad Baja");
//        } else if(nivel == 2) {
//            System.out.println("Prioridad Media");
//        } else if(nivel == 1 ){
//            System.out.println("Prioridad Alta");
//        }

//        //8
//        Scanner sc8 = new Scanner(System.in);
//        System.out.println("Ingrese su Edad: ");
//        int edad = sc8.nextInt();
//        System.out.println("Ha tenido enfermedades cronicas: ");
//        String enfermedades = sc8.next();
//        System.out.println("Usted Fuma: ");
//        String fuma = sc8.next();
//        String seguro = (edad == 30 && enfermedades.equals("no") && fuma.equals("no"))? "ES elegible al seguro Premium" : "NO el elegible";
//        System.out.println(seguro);

//        //9
//        Scanner sc9 = new Scanner(System.in);
//        System.out.println("Digite los ingresos Proyectados: ");
//        int ingresos = sc9.nextInt();
//        System.out.println("Ingrese los costos Iniciales:");
//        int costo = sc9.nextInt();
//        System.out.println("Ingrese costos anuales: ");
//        int operativos = sc9.nextInt();
//        System.out.println("Ingrese los años de los costos Operativos: ");
//        int anios = sc9.nextInt();
//        int costoAnios = operativos * anios;
//        int gastos =  costo + costoAnios;
//        int ganancia = ingresos - gastos;
//        if (ingresos > gastos) {
//            System.out.println("El proyecto es rentable con: " + ganancia + " COP");
//        } else if (ingresos < gastos) {
//            System.out.println("El proyecto NO es rentable con: "  + ganancia + " COP");
//        }else{
//            System.out.println("Es igual");
//        }

        //10
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Valor de la Propiedad: ");
        int valor = sc10.nextInt();
        System.out.println("Ingrese el % de tasa de interes: ");
        double interes = sc10.nextInt();
        double tasa = interes / 100;
        double impuesto = valor * tasa;
        System.out.println("La tarifa de impuestos es: " + impuesto + " COP");
    }
    
}
