class Teste_Casting{
  public static void main(String[] args){
  //Erro como o esperado
  ///1º Exemplo
  ///double d = 3.1415;
  ///int i = d;
  ///2º Exemplo
  ///int i = 3.14;
  ///3º Exemplo
  //double d = 5;
  //int i = d;
  ///4º Exemplo
  ///Funcional
  int i = 5;
  double d = i;
  //Casting
  double  d3 = 3.14;
  int i2 = (int) d3; 
  //Ou Classe Wrapper
  //Interger i2 = Interger d3;
  System.out.println("O valor depois do casting é=" +i2);
  long x = 1000;
  //int i = x;
  //Casting
  int i3 = (int) x;
   //Erro:Valor com virgula é considerado double
  //float f = 0.0;
  float f = 0.0f; 
  double e = 5;
  float g = 3;
  float h = g + (float) e;
}
}
