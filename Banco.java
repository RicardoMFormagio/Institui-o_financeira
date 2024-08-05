public class Banco {

    //atributos
    private int numDaConta;
    public String nomeDoTitular;
    public int depositoInicial;
    private int saldo;

    //metodo construtor
    public Banco() {
        this.numDaConta = 0000;
        this.nomeDoTitular = "Nome do titular";
        this.depositoInicial = 0;
        this.saldo = depositoInicial;
    }

    //metodos

    ////Get e set NUMERO DA CONTA
    public int getNumDaConta() {
        return this.numDaConta;
    }
    public void setNumDaConta(int num) {
        this.numDaConta = num;
    }

    ////Get e set NOME DO TITULAR
    public String getNomeDoTitular() {
        return this.nomeDoTitular;
    }
    public void setNomeDoTitular(String nome) {
        this.nomeDoTitular = nome;
    }

    ////Get e Set DEPOSITO INICIAL
    public int getDepositoInicial() {
        return this.depositoInicial;
    }
    public void setDepositoInicial(int dep) {
        this.depositoInicial = dep;
        this.saldo = dep;
    }

    ////Get e set SALDO
    public int getSaldo() {
        return this.saldo;
    }
    public void setSaldo(int depSaque) {
        if (depSaque >= 0) {
            this.saldo = saldo + depSaque;
        }
        else {
            depSaque -= 5;
            this.saldo = saldo + depSaque;
        }
    }

    //// status
    public void status() {
        System.out.println("Sobre o banco: ");
        System.out.println("Numero da conta: " + this.getNumDaConta());
        System.out.println("Nome do titular: " + this.getNomeDoTitular());
        System.out.println("Deposito inicial: " + this.getDepositoInicial());
        System.out.println("Saldo em conta: " + this.getSaldo());
    }

}