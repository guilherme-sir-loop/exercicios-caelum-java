class Fibonacci{
  public static void main(String[] args){
  int proximo = 1;
  int anterior = 0;
  while(anterior <= 100){
     System.out.println(anterior);
    proximo += anterior;
    anterior = proximo - anterior;
   
   
}
}
}
