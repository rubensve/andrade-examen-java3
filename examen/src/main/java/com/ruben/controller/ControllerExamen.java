
package com.ruben.controller;

import com.ruben.model.Evaluacion;
import com.ruben.model.GeneradorCalificaciones;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-calificacion")

public class ControllerExamen {
    
@RequestMapping(value ="/calificar", method = RequestMethod.GET, headers =("Accept=Application/json"))
@ResponseBody ArrayList<Evaluacion> leerEvaluacion(){
 return GeneradorCalificaciones.generarCalificaciones();
}


    
}
