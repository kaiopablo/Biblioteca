/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import VO.Livro;
import VO.ValueObject;
import static controller.Util.TypeData.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lucasfernandes
 */
public class LivroController extends BaseController {
    
    public LivroController()
    {
        super(LIVRO);
    }

    public ArrayList<ValueObject> getListLivros(String filtro){
        ArrayList<ValueObject> lista = new ArrayList<>();
        for (Livro ac : (List<Livro>) this.search()) {
            if(filtro.equals("") || ac.getTitulo().toLowerCase().contains(filtro) ||
                    ac.getIsbn().toLowerCase().contains(filtro)){
                lista.add(ac);
            }
        }
        return lista;
    }

}
