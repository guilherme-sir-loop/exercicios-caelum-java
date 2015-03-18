class BalancoPatrimonial{
  public static void main(String[] args){
   int gastosJaneiro = 15000;
   int gastosFevereiro = 23000;
   int gastosMarco = 17000;
   int gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
   System.out.println(gastoTrimestral);
   int mediaMensal = gastoTrimestral/3;
   //String concatenada
   //String valorMediaMensal = "Valor de média mensal="+ mediaMensal;

   System.out.println("Valor da média mensal =" +mediaMensal);
   //System.out.println(mediaMensal);
}
}
