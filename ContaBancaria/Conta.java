class Conta {
    private int numero;
    private int digito;
    private String senha;
    private String titular;
    private float saldo;

    public  Conta(int numero, int digito, String senha, String titular){
        this.digito = digito;
        this.senha =  senha;
        this.titular = titular;
        this.numero = numero;

    }

    public int getNumero(){
        return  numero;
    }
    public  int getDigito(){
        return  digito;
    }
    public String getSenha(){
        return senha;
    }
    public String getTitular(){
        return titular;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setDigito(int digito){
        this.digito = digito;
    }
    public  void setSenha(String senha){
        this.senha = senha;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Deposito(double quantia)
    {
        saldo += quantia;
    }

    public void Saque(double quantia)
    {
        saldo -= (quantia + 5.0);
    }

    @Override
    public String toString(){
        return "Titular: " + getTitular() + "\nConta: " + getNumero() + "-" + getDigito() + "\nSaldo: R$ " +  String.format("%.2f", getSaldo());
    }
}
