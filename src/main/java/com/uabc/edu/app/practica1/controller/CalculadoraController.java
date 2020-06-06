package com.uabc.edu.app.practica1.controller;

import com.uabc.edu.app.practica1.model.Operacion;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {
    @PostMapping("ops")
    public Operacion operaciones(@RequestBody
                                         Operacion operacion){
        switch (operacion.getOp()){
            case SUMA:
                operacion.setResultado(operacion.getNumeroA()+
                        operacion.getNumeroB());
                break;
            case RESTA:
                operacion.setResultado(operacion.getNumeroA()-
                        operacion.getNumeroB());
                break;
            case DIVISION:
                if(operacion.getNumeroA()!=0&&operacion.getNumeroB()!=0){
                    operacion.setResultado(operacion.getNumeroA()/operacion.getNumeroB());
                }
                break;
            case MULTIPLICACION:
                operacion.setResultado(operacion.getNumeroA()*
                        operacion.getNumeroB());
                break;

        }
        return operacion;
    }
    @GetMapping("/")
    public String saludito(){

        return "<b>Holis!!!</b><br>" +
                "<div style=\"color:red\">" +
                " Bienvenido al purgatorio</div>";
    }

    @GetMapping("/suma")
    public double suma(@RequestParam(value = "numA") double a,
                       @RequestParam(value = "numB") double b){
        return a+b;
    }
    @GetMapping("/resta")
    public double resta(@RequestParam(value = "numA") double a,
                       @RequestParam(value = "numB") double b){
        return a-b;
    }//localhost:8080/suma?numA=20&numB=70


}
