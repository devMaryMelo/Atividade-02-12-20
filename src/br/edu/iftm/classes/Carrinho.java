package br.edu.iftm.classes;

import java.util.ArrayList;

public class Carrinho 
{
    //Atributos
    private float valorTotal;
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    //Método para adicionar um produto na lista de produtos
    public void adicionar(Produto produto)
    { 
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    //Método para imprimir na tela os produtos do carrinho
    public void mostrarProdutos()
    {
        System.out.println("\nPRODUTOS DO CARRINHO");

        for(int i = 0; i < produtos.size(); i++)
        {
            String nome = produtos.get(i).getNome();
            String categoria = produtos.get(i).getCategoria();
            float preco = produtos.get(i).getPreco();
            System.out.format("%d. %s (categoria: %s) - R$%.2f\n", i + 1, nome, categoria, preco);
        }
        System.out.format("Valor total: R$%.2f\n", getValorTotal());
    }

    //Método para retornar o Valor Total da compra
    public float getValorTotal()
    {
        return valorTotal;
    }
}
