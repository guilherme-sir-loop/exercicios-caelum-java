class TestaAlgunsMetodos{
  public static void main(String[] args){
   //Criando a conta
   ContaOO minhaConta;
   minhaConta = new ContaOO();

   //Alterar valores da minha conta
   minhaConta.dono = "Nuke";
   minhaConta.saldo = 1000;

   //Saca 200 reais
   minhaConta.saca(200);

  //Deposita mais 500 reais
  minhaConta.deposita(500);
  System.out.println(minhaConta.saldo);

  //Teste de Exemplo com boolean
  //boolean consegui = minhaConta.saca(2000);
  //if(consegui){
   //System.out.println("Consegui sacar");
  //}
  //else{  
   //System.out.println("Não consegui sacar");
  //}
  //Eliminar variavel temporaria
  if(minhaConta.saca(2000)){
	System.out.println("Consegui sacar");
}
  else{
	System.out.println("Não consegui sacar");
	
}
   //Adicionar nova conta
   ContaOO meuSonho;
   meuSonho = new ContaOO();
   meuSonho.saldo = 15000;
   System.out.println(meuSonho.saldo);
  

}

}
