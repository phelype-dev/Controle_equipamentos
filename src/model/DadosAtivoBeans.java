package model;
public class DadosAtivoBeans {

    
    private int id_dados;
    private String nome;
    private String email;
    private String sessao;
    private String telefone;
    private String celular;
    private String data_cadastro;
    private LoginBeans dados_id;

    /**
     * @return the id_dados
     */
    public int getId_dados() {
        return id_dados;
    }

    /**
     * @param id_dados the id_dados to set
     */
    public void setId_dados(int id_dados) {
        this.id_dados = id_dados;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sessao
     */
    public String getSessao() {
        return sessao;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the data_cadastro
     */
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    /**
     * @return the dados_id
     */
    public LoginBeans getDados_id() {
        return dados_id;
    }

    /**
     * @param dados_id the dados_id to set
     */
    public void setDados_id(LoginBeans dados_id) {
        this.dados_id = dados_id;
    }
}