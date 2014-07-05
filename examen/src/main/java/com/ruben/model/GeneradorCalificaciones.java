package com.ruben.model;

import java.util.ArrayList;

public class GeneradorCalificaciones {

    public static ArrayList<Evaluacion> generarCalificaciones(){
    ArrayList<Evaluacion> alumnos= new ArrayList<Evaluacion>();
            
            Evaluacion alumno;
         alumno= new Evaluacion("Petra", (float) 5.8);
         alumnos.add(alumno);
         
         alumno= new Evaluacion("Jose", (float) 7.4);
         alumnos.add(alumno);
         
         alumno= new Evaluacion("Roberta", (float) 8.6);
         alumnos.add(alumno);
         
      return alumnos;
      
  }

}
