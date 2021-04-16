package aula07b;
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Personalizados
    public void apresentar() {
        System.out.println("----------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura");
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getEmpates() + " empates e ");
        System.out.println(this.getDerrotas() + " derrotas");
    }
    
    public void status () {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("ganhou " + this.getVitorias() + " vezes");
        System.out.println("empatou " + this.getEmpates() + " vezes");
        System.out.println("perdeu " + this.getDerrotas() + " vezes");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() +1);
    }
    
    // Métodos Especiais
    public Lutador (String no, String na, int id,float al,float pe,int vi,int de,int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    
    public String getNome () {
        return nome;
    }
    
    public void setNome (String no) {
        this.nome = no;
    }
    
    private String getNacionalidade () {
        return nacionalidade;
    }
    
    private void setNacionalidade (String na) {
        this.nacionalidade = na;
    }
    
    private int getIdade () {
        return idade;
    }
    
    private void setIdade (int id) {
        this.idade = id;
    }
    
    private double getAltura () {
        return altura;
    }
    
    private void setAltura(float al) {
        this.altura = al;
    }
    
    private double getPeso () {
        return peso;
    }
    
    private void setPeso (float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    public String getCategoria () {
        return categoria;
    }
    
    public void setCategoria () {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    private int getVitorias () {
        return vitorias;
    }
    
    private void setVitorias (int vi) {
        this.vitorias = vi;
    }
    
    private int getDerrotas () {
        return derrotas;
    }
    
    private void setDerrotas (int de) {
        this.derrotas = de;
    }
    
    private int getEmpates () {
        return empates;
    }
    
    private void setEmpates (int em) {
        this.empates = em;
    }
}
