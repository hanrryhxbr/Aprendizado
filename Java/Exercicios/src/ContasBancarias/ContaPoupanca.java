package ContasBancarias;

public class ContaPoupanca extends Conta{
    @Override
    public void atualiza(double taxaSelic) {
        super.atualiza(taxaSelic * 0.75);
    }

    //mÃ©todo antigo sem utilizar "super."
//    public void atualiza(double taxaSelic) {
//        double saldo = this.getSaldo();
//        this.deposita(((saldo * (1 + 0.75 * taxaSelic)) - saldo));
//    }
}
