package br.edu.iftm.classes;

public class Produto 
{
    //Atributos
    private String nome;
    private String categoria;
    private float preco;

    //Método Construtor
    public Produto(String nome, String categoria, float preco)
    {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    //Métodos getters e setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }
    
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public String getCategoria()
    {
        return this.categoria;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public float getPreco()
    {
        return this.preco;
    }
}
