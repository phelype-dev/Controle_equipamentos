package model;

/**
 *
 * @author Phelype
 */
public class PecasManut {
    
    private int id_pecas;
    private String peca;
    private float valor;
    private String imagem;

    /**
     * @return the id_pecas
     */
    public int getId_pecas() {
        return id_pecas;
    }

    /**
     * @param id_pecas the id_pecas to set
     */
    public void setId_pecas(int id_pecas) {
        this.id_pecas = id_pecas;
    }

    /**
     * @return the peca
     */
    public String getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(String peca) {
        this.peca = peca;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
