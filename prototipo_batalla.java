package com.example.juego_del_uno;

import java.util.Scanner;

public class prototipo_batalla {
    static Scanner sc=new Scanner(System.in);
    static int eje_x,eje_y;
    static int campo1[][];
    static int campo2[][];
    static String nom_1,nom_2;
    static String decidion,posicion;
    public static void main(String [] args){
        System.out.println("Bienvenido a batalla Naval");
        System.out.println("Favor de ingresar el tamaño del campo de forma horizontal");
        eje_x= sc.nextInt();
        System.out.println("Ingrese el tamaño del campo de forma vertical");
        eje_y= sc.nextInt();
        campo1=new int[eje_x][eje_y];
        campo2= new int[eje_x][eje_y];

        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y; j++){
                System.out.print(campo1[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Ingresa el Nombre deL Jugador uno");
        nom_1= sc.next();
        System.out.println("Ingresa el nombre del jugador dos");
        nom_2= sc.next();
        System.out.println("Desea Iniciar partida (si/no)");
        decidion= sc.next();
        if (decidion.equalsIgnoreCase("si")||decidion.equalsIgnoreCase("s")){
            System.out.println("Desea poner sus barcos "+nom_1);
            decidion= sc.next();
            if (decidion.equalsIgnoreCase("si")||decidion.equalsIgnoreCase("s")){
                jugadorbarcos1();
            }
            System.out.println("Desea poner sus barcos "+nom_2);
            decidion=sc.next();
            if (decidion.equalsIgnoreCase("si")||decidion.equalsIgnoreCase("s")){
                jugadorbarcos2();
            }
            iniciojuego();
        }
    }
    public static void jugadorbarcos1(){
            System.out.println("Ingresa la poscion de su barco No.1 (Horizontal/vertical) o (h/v) ");
            posicion= sc.next();
            if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
                System.out.println("Ingresa la coordenada de forma horizontal");
                int h= sc.nextInt();
                System.out.println("Ingrese la coordenada de forma Vertical");
                int v= sc.nextInt();
                if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y){

                        for (int i=0; i<1; i++){
                            campo1[v][h+i]=1;
                        }

                    for (int i=0; i<eje_x; i++){
                        for (int j=0; j<eje_y; j++){
                            System.out.print(campo1[i][j]+"  ");
                        }
                        System.out.println("");
                    }
                }
            }else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y){

                for (int i=0; i<1; i++){
                    campo1[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No.2 (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<2; i++){
                    campo1[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<2; i++){
                    campo1[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No.3 (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<3; i++){
                    campo1[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<3; i++){
                    campo1[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No. (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<4; i++){
                    campo1[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<4; i++){
                    campo1[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo1[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
    }
    public static void jugadorbarcos2(){
        System.out.println("Ingresa la poscion de su barco No.1 (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y){

                for (int i=0; i<1; i++){
                    campo2[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y){

                for (int i=0; i<1; i++){
                    campo2[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No.2 (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<2; i++){
                    campo2[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<2; i++){
                    campo2[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No.3 (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<3; i++){
                    campo2[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<3; i++){
                    campo2[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ingresa la poscion de su barco No. (Horizontal/vertical) o (h/v) ");
        posicion= sc.next();
        if (posicion.equalsIgnoreCase("Horizontal")||posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<4; i++){
                    campo2[v][h+i]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
        else if (posicion.equalsIgnoreCase("vertical")||posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la coordenada de forma horizontal");
            int h= sc.nextInt();
            System.out.println("Ingrese la coordenada de forma Vertical");
            int v= sc.nextInt();
            if (h >= 0 && h <eje_x && v >= 0 && v<=eje_y ){

                for (int i=0; i<4; i++){
                    campo2[v+i][h]=1;
                }

                for (int i=0; i<eje_x; i++){
                    for (int j=0; j<eje_y; j++){
                        System.out.print(campo2[i][j]+"  ");
                    }
                    System.out.println("");
                }
            }
        }
    }
    public static void iniciojuego(){
        System.out.println("Se Acabaron los preparativos es la hora de comenzar esta guerra");

        for (int i=0; i<eje_x; i++)
            for (int j=0; j<eje_y; j++)

                for (int w=0; w<eje_x; w++)
                    for (int z=0; z<eje_y; z++)
        while (campo1[i][j]==1 && campo2[w][z]==1){
            System.out.println(nom_1+" es tu turno de atacar deseas atacar");
                System.out.println("Ingresa la coordenada de forma horizontal que deseas atacar");
                int h= sc.nextInt();
                System.out.println("Ingresa la coordenada q desea atacar de forma vertical");
                int v= sc.nextInt();
                if (campo2[v][h]==1){

                    for (int t=0; t<1; t++ ){
                        campo2[v][h]=5;
                    }

                    for (int e=0; e<eje_x; i++){
                        for (int o=0; o<eje_y;j++){
                            System.out.print(campo2[e][o]+ " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Genial le diste sigue asu");

                }else if (campo2[v][h]==0){

                    for (int t=0; t<1; t++ ){
                        campo2[v][h]=5;
                    }

                    for (int e=0; e<eje_x; i++){
                        for (int o=0; o<eje_y;j++){
                            System.out.print(campo2[e][o]+ " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Lastima no habia nadie ahy");
                }

            System.out.println("Jugador 2 " +nom_2+ " es tu de atacar");

                System.out.println("ingresa la coordenada de manera horizontal para atacar");
                h= sc.nextInt();
                System.out.println("ingresa la coordenada de manera vertical");
                v= sc.nextInt();
                if (campo1[v][h]==1){

                    for (int t=0; t<1; t++ ){
                        campo1[v][h]=5;
                    }

                    for (int e=0; e<eje_x; i++){
                        for (int o=0; o<eje_y;j++){
                            System.out.print(campo1[e][o]+ " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Genial le diste sigue asu");

                }else if (campo1[v][h]==0){

                    for (int t=0; t<1; t++ ){
                        campo1[v][h]=5;
                    }

                    for (int e=0; e<eje_x; i++){
                        for (int o=0; o<eje_y;j++){
                            System.out.print(campo1[e][o]+ " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Lastima no habia nadie ahy");
                }

        }
        for (int i=0; i<eje_x; i++)
            for (int j=0; j<eje_y; j++)

                for (int w=0; w<eje_x; w++)
                    for (int z=0; z<eje_y; z++)
                        if (campo1[i][j]==1 ||campo2[w][z]==1){
                            if (campo1[i][j]==1){
                                System.out.println(nom_1+" perdiste mejor suerte la proxima");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(campo1[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }else{
                                System.out.println(nom_1+ " Has Ganado");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(campo1[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            if (campo2[i][j]==1){
                                System.out.println(nom_2+ " mejor suerte la proxima");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(campo2[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }else {
                                System.out.println(nom_2 + " has ganado");
                                for (int e=0; e<eje_x; i++){
                                    for (int o=0; o<eje_y;j++){
                                        System.out.print(campo2[e][o]+ " ");
                                    }
                                    System.out.println("");
                                }
                            }
                        }
    }

}
