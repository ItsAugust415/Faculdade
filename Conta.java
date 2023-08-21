public class Conta {
    private int numConta, numAgen;
    private float saldo, valLimiteExtra;
    private boolean limiteExtra;

    public Conta(int numConta, int numAgen, float saldo, float valLimiteExtra, boolean limiteExtra){
        this.numConta = numConta;
        this.numAgen = numAgen;
        this.saldo = saldo;
        this.valLimiteExtra = 0.0; //precisa ver se muda pra double ou deixa float
        this.limiteExtra = false;
    }


    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumAgen(){
        return numAgen;
    }
    public void setNumAgen(int numAgen){
        this.numAgen = numAgen;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getLimiteExtra(){
        return limiteExtra;
    }
    public void setLimiteExtra(boolean limiteExtra){
        this.limiteExtra = limiteExtra;
    }

    public float getValLimiteExtra(){
        return valLimiteExtra;
    }
    public void setValLimiteExtra(float valLimiteExtra){
        this.valLimiteExtra = valLimiteExtra;
    }
}
