class ContaOO{
  
   int numero;
   String dono;
   double saldo;
   double limite;

   //Não devolve nenhum valor
  // void saca(double quantidade){
    // double novoSaldo = this.saldo - quantidade;
     //this.saldo = novoSaldo;
//}
 //Não devolve nenhum valor
  void deposita(double quantidade){ this.saldo += quantidade; }


  boolean saca(double valor){
    if(this.saldo < valor){ return false; }
    else {
    	this.saldo = this.saldo - valor; 
    	return true;  	
    }
}
	//ContaOO c1;
	//c1 = new ContaOO();

	//ContaOO c2;
	//c2 = new ContaOO();
	
//	void transfere(ContaOO destino,double valor){
//	 this.saldo = this.saldo - valor;
//	 destino.saldo = destino.saldo + valor;
//}
	boolean transfere(ContaOO destino,double valor){
	  boolean retirou = this.saca(valor);
	 if(retirou == false){
 	  return false; 
 }	
         else{
           destino.deposita(valor);
	   return true;
}
}

  //Testando valores default
	//int numero = 1234;
	//String dono = "Duke";
	//String cpf = "123.456.789-10";
	//double saldo = 1000;
	//double limite = 1000;
 
	    
	
}
