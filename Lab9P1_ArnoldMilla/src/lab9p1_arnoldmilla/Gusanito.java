package lab9p1_arnoldmilla;

import java.util.*;
import javax.swing.*;

public class Gusanito {

    Random rand = new Random();
    int ManY;
    int ManX;
    int SerpY;
    int SerpX;
    int Obs;
    char tablero[][];
    ArrayList<String> instrucciones;

    public Gusanito(int hsize, int vsize) {

        tablero = new char[hsize][vsize];

    }

    public char [][] matriz(int hsize, int vsize) {
        int ManY = rand.nextInt(hsize);
        int ManX = rand.nextInt(vsize);
        int SerpX = rand.nextInt(vsize);
        int SerpY = rand.nextInt(hsize);
        int Obs =1;
        
        
        if (hsize > vsize){
             Obs = rand.nextInt(vsize, hsize);
        }
        else if (vsize > hsize){
             Obs = rand.nextInt(hsize, vsize);
        }
        else {
             Obs = rand.nextInt( vsize);
        }

        
        for (int cont = 0; cont < tablero.length; cont++) {
            for (int contador = 0; contador < tablero[cont].length; contador++) {
                 tablero[cont][contador] = ' ';
            }
        }
            for (int i = 0; i < Obs; i++) {
                    int posXo = rand.nextInt(hsize);
                    int posYo = rand.nextInt(vsize);
                    tablero[posXo][posYo] = '#';
            }
        tablero[ManX][ManY] = 'Ó';
        tablero[SerpX][SerpY] = 'S';
        
        return tablero;
    }
    
    public String llenar (char [][] matriz){
        String print = "";
        
        for (int cont= 0; cont < tablero.length; cont++) {
            for (int contador = 0; contador < tablero[cont].length; contador++) {
                print += '[';
                print += tablero[cont][contador];
                print += ']';
                  
            }
             print += "\n"; 
        }
        return print;
    }
    
    public String mostrarPaso (ArrayList<String> IN, char [][] matriz){
        int posC = 0;
        int poscontador = 0;
        
        for (int cont = 0; cont < IN.size(); cont++) {
            String instruccion = IN.get(cont);
            int desplazamiento = instruccion.charAt(0);
            char direccion = instruccion.charAt(1);
            
            switch (direccion){
                case 'U': {
                    for (int c = 0; c < matriz.length; c++) {
                        for (int contador = 0; contador < matriz[cont].length; contador++) {
                            if (matriz [c][contador] == 'S'){
                                matriz [c][contador] = ' ';
                            }
                        }
                    }
                    if(poscontador + desplazamiento < matriz.length + 1){
                        matriz [poscontador + desplazamiento][posC] = 'S';
                    }
                    
                }break;
                
                case 'D': {
                    for (int c = 0; c < matriz.length; c++) {
                        for (int contador = 0; contador < matriz[cont].length; contador++) {
                            if (matriz [c][contador] == 'S'){
                                matriz [c][contador] = ' ';
                            }
                        }
                    }
                    if(poscontador - desplazamiento > 0){
                        matriz [poscontador - desplazamiento][posC] = 'S';
                    }
                    
                }break;
                
                case 'R': {
                    for (int c = 0; c < matriz.length; c++) {
                        for (int contador = 0; contador < matriz[cont].length; contador++) {
                            if (matriz [c][contador] == 'S'){
                                matriz [c][contador] = ' ';
                            }
                        }
                    }
                    if(posC + desplazamiento < matriz.length + 1){
                        matriz [poscontador][posC + desplazamiento] = 'S';
                    }                   
                }break;
                
                case 'L': {
                    for (int c = 0; c < matriz.length; c++) {
                        for (int contador = 0; contador < matriz[cont].length; contador++) {
                            if (matriz [c][contador] == 'S'){
                                matriz [c][contador] = ' ';
                            }
                        }
                    }
                    if(posC - desplazamiento > 0){
                        matriz [poscontador][posC - desplazamiento] = 'S';
                    }
                }break;
            }
        }
        String print = "";
        
        for (int cont= 0; cont < matriz.length; cont++) {
            for (int contador = 0; contador < matriz[cont].length; contador++) {
                print += '[';
                print += matriz[cont][contador];
                print += ']';
                  
            }
             print += "\n"; 
        }
        
        return print;
    }
                  
}
