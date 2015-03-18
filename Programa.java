class Programa {
 public static void main(String[] args){
  ContaOO minhaConta;
  minhaConta = new ContaOO();
  
  minhaConta.dono = "Duke";
  minhaConta.saldo = 1000.0;

  System.out.println("Saldo atual:" +minhaConta.saldo);
}
}
