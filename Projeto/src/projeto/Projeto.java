/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author Pedro H.
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vendedor v1 = new Vendedor("Gilberto", "00000000", "8888888");
        v1.setSalario(800.0);
        v1.setComissao(10.00);
        v1.setQtdVendas(10);
        
        System.out.println(v1.getDados()+"\n");
        
        Motorista m1 = new Motorista("Lucas", "1111111", "999999999");
        m1.setSalario(800.0);
        
        System.out.println(m1.getDados());
        
        // Criando lista
        
        ArrayList<Funcionario> funcs = new ArrayList();
        
        funcs.add(v1);
        funcs.add(m1);
    }
    
}
