/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import VO.Associado;
import VO.Emprestimo;
import VO.Livro;
import VO.ValueObject;
import static controller.Util.TypeData.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author lucasfernandes
 */
public class EmprestimoController extends BaseController {
    
    public EmprestimoController()
    {
        super(EMPRESTIMO);
    }
    
    public int getLivrosEmprestando(Associado associado)
    {
        int qtd = 0;
        for (Emprestimo ac : (List<Emprestimo>) this.search()) {
            if(ac.getDevolucao() == null)
            if(ac.getAssociado().getId() == associado.getId())qtd++;
        }
        return qtd;
    }
    
    public boolean isSemExemplares(Livro livro)
    {
        int qtd = 0;
        for (Emprestimo ac : (List<Emprestimo>) this.search()) {
            if(ac.getDevolucao() == null)
            if(ac.getLivro().getId() == livro.getId())qtd++;
        }
        if(livro.getNumeroExemplares() <= qtd)return true;
        return false;
    }

    public double calcularMulta(Emprestimo emprestimo, Date entrega)
    {
        int Dias = Utils.Functions.daysBetween(emprestimo.getPrevisao(), entrega);
        System.out.println(Dias);
        if(Dias > 0){
            return Dias * 1.00;
        }else{
            return 0;
        }
    }
    
    public ArrayList<ValueObject> getListEmprestimo(String filtro)
    {
        ArrayList<ValueObject> lista = new ArrayList<>();
        for (Emprestimo ac : (List<Emprestimo>) this.search()) {
            if(ac.getDevolucao() == null)
            if(filtro.equals("") || ac.getLivro().getTitulo().contains(filtro) ||
                    ac.getLivro().getIsbn().contains(filtro) || ac.getAssociado().getNome().toLowerCase().contains(filtro)){
                lista.add(ac);
            }
        }
        return lista;
    }
}
