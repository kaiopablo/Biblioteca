/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Util;

import VO.*;

/**
 *
 * @author lucasfernandes
 */
public final class TypeDataOperation {

    public static String getTypeDataBaseString(TypeData typeData) {
        switch (typeData) {
            case ASSOCIADO:
                return "Associado";
            case AUTOR:
                return "Autor";
            case AUTORIA:
                return "Autoria";
            case EMPRESTIMO:
                return "Emprestimo";
            case LIVRO:
                return "Livro";
            case OPERADOR:
                return "Operador";
        }
        return "";
    }

    public static String getTypeDataString(TypeData typeData) {
        switch (typeData) {
            case ASSOCIADO:
                return "Associado";
            case AUTOR:
                return "Autor";
            case AUTORIA:
                return "Autoria";
            case EMPRESTIMO:
                return "Emprestimo";
            case LIVRO:
                return "Livro";
            case OPERADOR:
                return "Operador";
        }
        return "";
    }

    public static Class getTypeDataClass(TypeData typeData) {
        switch (typeData) {
            case ASSOCIADO:
                return Associado.class;
            case AUTOR:
                return Autor.class;
            case AUTORIA:
                return Autoria.class;
            case EMPRESTIMO:
                return Emprestimo.class;
            case LIVRO:
                return Livro.class;
            case OPERADOR:
                return Operador.class;
            default:
                return Object.class;
        }
    }

    public static boolean isClassOfTypeData(TypeData typeData, ValueObject valueObject) {
        return getTypeDataClass(typeData) == valueObject.getClass();
    }

    public static String[] getAttributesTitleList(TypeData typeData) {
        switch (typeData) {
            // ADICIONAR AQUI A LISTA DE ATRIBUTOS DA TABELA SE NECESSARIO
            default:
                return new String[]{};
        }
    }
}
