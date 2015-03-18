class Cliente{
  String nome;
  String sobrenome;
  String cpf;
}
class Conta{
  int numero;
  double saldo;
  double limite;
  Cliente titular = new Cliente();
}
  void deposita(double quantidade){ this.saldo += quantidade; }


  boolean saca(double valor){
    if(this.saldo < valor){ return false; }
    else {
    	this.saldo = this.saldo - valor; 
    	return true;  	
    }
}
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
