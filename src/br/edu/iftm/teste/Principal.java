package br.edu.iftm.teste;

import br.edu.iftm.classes.Produto;
import br.edu.iftm.classes.Carrinho;

public class Principal 
{
    public static void main(String args[])
    {
        Carrinho compras = new Carrinho();
        Produto tv = new Produto("SmartTV Samsung 40", "Eletronicos", 2100.992f);
        Produto notebook = new Produto("Notebook Dell", "Eletronicos", 4549.90f);
        Produto livro = new Produto("Sussurros na Escuridao", "Livro", 19.90f);

        compras.adicionar(tv);
        compras.adicionar(notebook);
        compras.adicionar(livro);
        compras.mostrarProdutos();
    }
    
}
