package PrimeiroPrograma;


public class PrimeiroPrograma {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Java do Javali", 142);
        System.out.println(livro1);
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas){
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}