/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Operador;
import VO.ValueObject;
import static controller.Util.TypeData.OPERADOR;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viniciuscustodio
 */
public class OperadorController extends BaseController {
 
    public OperadorController(){
        super(OPERADOR);
    }
    
    public ArrayList<ValueObject> getListOperador(String filtro){
        ArrayList<ValueObject> lista = new ArrayList<>();
        for (Operador ac : (List<Operador>) this.search()) {
            if(filtro.equals("") || ac.getLogin().toLowerCase().contains(filtro)){
                lista.add(ac);
            }
        }
        return lista;
    }
    
        public ArrayList<Operador> getListOperadorLogin(String filtro){
        ArrayList<Operador> lista = new ArrayList<>();
        for (Operador ac : (List<Operador>) this.search()) {
            if(ac.getLogin().toLowerCase().contains(filtro)){
                lista.add(ac);
            }
        }
        return lista;
    }
}
