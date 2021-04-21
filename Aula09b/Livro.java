package aula09b;
public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos Personalizados
    public String detalhes() {
        return "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" + "\n" +
                "Livro: " + this.getTitulo() + "\n" +
                "Escrito por: " + this.getAutor() + "\n" +
                "Paginas: " + this.getTotPaginas() + " atual " + this.getPagAtual() + "\n" +
                "Leitor: " + leitor.getNome() + "\n" +
                "Título: " + this.getTitulo() + "\n" +
                "Autor: " + this.getAutor() + "\n" +
                "Idade: " + leitor.getIdade() + "\n" +
                "Sexo: " + leitor.getSexo() + "\n" +
                "Total de páginas: " + this.getTotPaginas() + "\n" +
                "Página atual: " + this.getPagAtual() + "\n" +
                "Aberto: " + this.getAberto() + "\n" +
                "Leitor: " + leitor.getNome() + "\n" +
                "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" + "\n";
    }
    
    // Método Contrutor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    // Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    
    // Métodos Abstratos da Interface
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotPaginas()) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    
    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

}
