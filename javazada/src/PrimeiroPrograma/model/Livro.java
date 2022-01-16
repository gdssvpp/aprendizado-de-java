package PrimeiroPrograma.model;

public class Livro {
    import java.util.Objects;

        private String nome;
        private String cor;
        private Integer idade;

        public Livro() {
        }

        public Livro(String nome, String cor, Integer idade) {
            this.nome = nome;
            this.cor = cor;
            this.idade = idade;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCor() {
            return this.cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public Integer getIdade() {
            return this.idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (o != null && this.getClass() == o.getClass()) {
                Livro gato = (Livro)o;
                return Objects.equals(this.nome, gato.nome) && Objects.equals(this.cor, gato.cor) && Objects.equals(this.idade, gato.idade);
            } else {
                return false;
            }
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.nome, this.cor, this.idade});
        }

        public String toString() {
            return "Gato{nome='" + this.nome + "', cor='" + this.cor + "', idade=" + this.idade + "}";
        }
    }
}
