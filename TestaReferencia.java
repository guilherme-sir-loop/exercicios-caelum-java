class TestaReferencia{
  public static void main(String[] args){
	ContaOO c1 = new ContaOO();
	//c1.deposita(100);
	c1.dono = "Duke";
	c1.saldo = 227;
	
	//ContaOO c2 = new ContaOO();
	//c2.dono = "Duke";
	//c2.saldo = 227;
	ContaOO c2 = c1; //linha importante!!
	c2.deposita(227	);
	
	//System.out.println(c1.saldo);
        //System.out.println(c2.saldo);
	if(c1 == c2){ System.out.println("Contas iguais"); }
        else { System.out.println("Valores diferentes"); }

}
}
