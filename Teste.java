class Teste{
  public static void main(String[] args){
    Conta minhaConta = new Conta();
    Cliente c = new Cliente();
    minhaConta.titular = c;
    minhaConta.titular.nome = "Duke";
    //Substitui o valor
    minhaConta.titular.nome = "Manuel";
    System.out.println(minhaConta.titular.nome);
}
}
