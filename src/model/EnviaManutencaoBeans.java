package model;
public class EnviaManutencaoBeans {

    private int id;
    private int cod_remesa;
    private MarcaImpBeans mdi_imp;
    private ModeloBeans mdm_id;
    private int patrimonio;
    private int sut;
    private String defeito;
    private String obs;
    private String data_envio;
    private TransportadoraBeans transporte;
    private EmpresaBeans destinatario;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cod_remesa
     */
    public int getCod_remesa() {
        return cod_remesa;
    }

    /**
     * @param cod_remesa the cod_remesa to set
     */
    public void setCod_remesa(int cod_remesa) {
        this.cod_remesa = cod_remesa;
    }

    /**
     * @return the mdi_imp
     */
    public MarcaImpBeans getMdi_imp() {
        return mdi_imp;
    }

    /**
     * @param mdi_imp the mdi_imp to set
     */
    public void setMdi_imp(MarcaImpBeans mdi_imp) {
        this.mdi_imp = mdi_imp;
    }

    /**
     * @return the mdm_id
     */
    public ModeloBeans getMdm_id() {
        return mdm_id;
    }

    /**
     * @param mdm_id the mdm_id to set
     */
    public void setMdm_id(ModeloBeans mdm_id) {
        this.mdm_id = mdm_id;
    }

    /**
     * @return the patrimonio
     */
    public int getPatrimonio() {
        return patrimonio;
    }

    /**
     * @param patrimonio the patrimonio to set
     */
    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the sut
     */
    public int getSut() {
        return sut;
    }

    /**
     * @param sut the sut to set
     */
    public void setSut(int sut) {
        this.sut = sut;
    }

    /**
     * @return the defeito
     */
    public String getDefeito() {
        return defeito;
    }

    /**
     * @param defeito the defeito to set
     */
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the data_envio
     */
    public String getData_envio() {
        return data_envio;
    }

    /**
     * @param data_envio the data_envio to set
     */
    public void setData_envio(String data_envio) {
        this.data_envio = data_envio;
    }

    /**
     * @return the transporte
     */
    public TransportadoraBeans getTransporte() {
        return transporte;
    }

    /**
     * @param transporte the transporte to set
     */
    public void setTransporte(TransportadoraBeans transporte) {
        this.transporte = transporte;
    }

    /**
     * @return the destinatario
     */
    public EmpresaBeans getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(EmpresaBeans destinatario) {
        this.destinatario = destinatario;
    }
    
    

    
}
