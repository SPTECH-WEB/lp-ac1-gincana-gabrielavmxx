package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;

    public Double getPremio() {
        return this.premio;
    }

    public Integer getQtdInscrito() {
        return qtdInscrito;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Gincana(String nome, Double premio){
        this.qtdInscrito = 0;
        this.ativa = true;
        this.nome = nome;
        this.premio = premio;
    }

    public void inscrever(Integer qtd){
        if(qtd == null || qtd <= 0 || ativa == false){

        }else{
            qtdInscrito += qtd;
        }
    }

    public Integer remover(Integer qtd){
        if(qtd == null || qtd <= 0 || ativa == false || qtd > qtdInscrito){
            return null;
        }else{
            //Caso altere o return o expected muda
            return qtdInscrito -= qtd;
            //return  qtd -= qtdInscrito;
        }
    }

    public Integer desativar(){
        if(ativa == false){
            return null;
        }else{
            ativa = false;
            Integer total = qtdInscrito;
            qtdInscrito = 0;
            return total;
        }
    }

    public void transferir(Gincana destino, Integer qtdATransferir){
        if(ativa == false || destino == null || destino.qtdInscrito == null || destino.ativa == false || destino.qtdInscrito == null ||destino.qtdInscrito < 0 || qtdATransferir == null || qtdATransferir <= 0 || qtdATransferir >= qtdInscrito){

        }else{
            qtdInscrito -= qtdATransferir;
            destino.qtdInscrito += qtdATransferir;
        }
    }

    public Boolean reajustarPremio(Double reajuste){
        if(reajuste == null || reajuste <= 0 ){
            return false;
        }else{
            premio = getPremio() * (1 + reajuste);
            return true;
        }
    }
}
