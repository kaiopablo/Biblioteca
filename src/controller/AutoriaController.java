/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import VO.Autoria;
import VO.Livro;
import VO.ValueObject;
import static controller.Util.TypeData.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lucasfernandes
 */
public class AutoriaController extends BaseController {
    
    public AutoriaController()
    {
        super(AUTORIA);
    }

    public ArrayList<Autoria> getListAutoria(Livro livro){
        ArrayList<Autoria> lista = new ArrayList<>();
        for (Autoria aut : (List<Autoria>) this.search()) {
            if(livro == null || aut.getLivro().getId() == livro.getId()){
                lista.add(aut);
            }
        }
        return lista;
    }
}
