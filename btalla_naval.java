package com.example.juego_del_uno;

import java.util.Scanner;

public class btalla_naval {
    static Scanner sc=new Scanner(System.in);
    static int tablero1[][];
    static int tablero2[][];
    static int eje_x,eje_y;
    static String ejey,ejex;
    static String comienzo, comienzoj1,comienzoj2;
    static String comienzobarcos,comienzodisparos;
    static int fila,columna;
    static String nom_j,nom_2;
    static int intentosj1,intentosj2=4;

    public static void main(String[]args){
        System.out.println("Bienvenido a Batlla Naval");
        System.out.println("A continuacion se te pedira el tamaño del tablero");
        System.out.println("Ingresa el tamaño de forma Horizontal");
        eje_x= sc.nextInt();
        System.out.println("ingresa el tamaño de forma vertical");
        eje_y=sc.nextInt();
        tablero1=new int[eje_x][eje_y];
        tablero2=new int[eje_x][eje_y];
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero1[i][j]=0;
            }
        }
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero2[i][j]=0;
            }
        }
        System.out.println("Tablero listo");
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                System.out.print(tablero1[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("A continuacion ingresa el nombre de los jugador");
        System.out.println("Jugador 1: ");
        nom_j=sc.next();

        System.out.println("Desea comenzar el juego (si/no)");
        comienzo=sc.next();
        if (comienzo.equalsIgnoreCase("si")|| comienzo.equalsIgnoreCase("s")) {
            System.out.println("La partida comenzara despues de los siguientes pasos");
            System.out.println("A continuacion ingresaran sus barcos en el tablero");
            System.out.println("Estas listo para ingresar tus barcos Jugador "+ nom_j+" (si/no)");
            comienzoj1=sc.next();
            if (comienzoj1.equalsIgnoreCase("si")|| comienzoj1.equalsIgnoreCase("s")){
                tablero1partidacominezo();
            }
            System.out.println("Jugador 2: ");
            nom_2=sc.next();
            System.out.println("Jugador "+nom_2+" estas listo para ingresar tus barcos(si/no)");
            comienzoj2=sc.next();
            if (comienzoj2.equalsIgnoreCase("si")|| comienzoj2.equalsIgnoreCase("s")){
                tablero2partidacomienzo();
            }
            ataquesjugadores();
        }
    }
    public static void tablero1partidacominezo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
             int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
           int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")||comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero1[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero1[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

    }
    public static void tablero2partidacomienzo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<1; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<2; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<3; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")|| comienzobarcos.equalsIgnoreCase("h")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero2[voy][hox+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")|| comienzobarcos.equalsIgnoreCase("v")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <eje_x && voy >= 0 && voy<=eje_y ){

                for (int i=0; i<4; i++){
                    tablero2[voy+i][hox]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(tablero2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
    }
    public static void ataquesjugadores(){
        System.out.println("se Terminaron los preparativos");
        System.out.println("Es Hora de comnezar la guerra ");
        for (int i=0; i<tablero1.length; i++)
            for (int j=0; j<tablero1.length-1; j++)

                for (int p=0; p<tablero2.length; p++)
                    for (int o=0; o<tablero2.length-1; o++)
                        while (tablero1[i][j]==1 && tablero2[p][o]==1){
                            System.out.println(nom_j+" Es tu turno de atacar");
                            System.out.println("Ingresa el disparo horizontal");
                            int x= sc.nextInt();;
                            System.out.println("Ingresa la coordenada vertical");
                            int y=sc.nextInt();
                            if ( x >= 0 && x < eje_x && y >= 0 && y<eje_y ){
                                if (tablero2[y][x]==1){
                                    System.out.println("Has Acertado continua asi");
                                    tablero2[y][x]=4;

                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero2[m][n]+" ");
                                        }
                                        System.out.println("");
                                    }
                                } else if (tablero2[y][x]==0) {
                                    System.out.println("Fallaste ");
                                    tablero2[y][x]=4;

                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero2[m][n]+ " ");
                                        }
                                        System.out.println("");
                                    }

                                }else if (tablero2[y][x]==4){
                                    System.out.println("Ya habias tirado anteriormente");

                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero2[m][n]+" ");
                                        }
                                        System.out.println("");
                                    }

                                }
                            }
                            System.out.println(nom_2 +" es tu turno");
                            System.out.println("ingresa la coordenada Horizontalmente");
                            x=sc.nextInt();
                            System.out.println("Ingresa la coordenada verticalmente");
                            y=sc.nextInt();
                            if (x>=0&& x<=eje_x&& y>=0 && y<=eje_y){
                                if (tablero1[y][x]==1){
                                    System.out.println("Has Acertado continua asi");
                                    tablero1[y][x]=4;

                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero1[m][n]+ " ");
                                        }
                                        System.out.println("");
                                    }
                                } else if (tablero1[y][x]==0) {
                                    System.out.println("Que lastima has fallado");
                                    tablero1[y][x]=4;

                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero1[m][n]+ " ");
                                        }
                                        System.out.println("");
                                    }
                                } else if (tablero1[y][x]==4) {
                                    System.out.println("Ya habias tirado anteriormente");


                                    for(int m=0; m<eje_x; m++){
                                        for (int n=0; n<eje_y; n++){
                                            System.out.print(tablero1[m][n]+" ");
                                        }
                                        System.out.println("");
                                    }
                                }
                            }
                        }
        for (int i=0; i<tablero1.length; i++)
            for (int j=0; j<tablero1.length-1; j++)

                for (int p=0; p<tablero2.length; p++)
                    for (int o=0; o<tablero2.length-1; o++)
                        if (tablero1[i][j]==1 || tablero2[p][o]==1){
                            if (tablero1[i][j]==1){
                                System.out.println(nom_2+ " has perdido");
                            } else  {
                                System.out.println( nom_2+" Has Ganado");
                            }
                            if (tablero2[p][o]==1){
                                System.out.println(nom_j+" has perdido");
                            }else {
                                System.out.println(nom_j+ " has ganado");
                            }
                            return;
                        }
    }
}
