/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VO.Associado;
import VO.ValueObject;
import static controller.Util.TypeData.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasfernandes
 */
public class AssociadoController extends BaseController {
    
    public AssociadoController()
    {
        super(ASSOCIADO);
    }

    public ArrayList<ValueObject> getListAssociado(String filtro){
        ArrayList<ValueObject> lista = new ArrayList<>();
        for (Associado ac : (List<Associado>) this.search()) {
            if(filtro.equals("") || ac.getNome().toLowerCase().contains(filtro)){
                lista.add(ac);
            }
        }
        return lista;
    }

}
