/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Home
 */
public class Vendedor extends Funcionario{
    
    private int qtdVendas;
    private Double comissao;
    
    public Vendedor(String nome, String CPF, String telefone){
        super(nome, CPF, telefone);
    }
    
    @Override
    public Double getSalario()
    {
        return this.salario + (this.qtdVendas * this.comissao);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
    
    
    
}
