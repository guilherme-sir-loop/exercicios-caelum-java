class Teste_Fluxo_If{
 public static void main(String[] args){
  int idade = 15;
  boolean amigoDoDono = true;
  if(idade < 18){
   System.out.println("Não pode entrar");
}
  //Pode-se usar também
 else { 
  System.out.println("Pode entrar");
}
//ou
//if(idade < 18; !amigoDoDono){...}
if(idade < 18 && amigoDoDono == false){
  System.out.println("Não pode entrar");
}
else{
  System.out.println("Pode entrar");
 }
 //Diferanciado o igual de atribuição com igual de comparação
 int mes = 1;
 if(mes == 1){
  System.out.println("Você deveria estar de férias!");
 }
 while(idade < 18){
 System.out.println(idade);
 idade = idade + 1;
 //idade++
 }
 int i = 0;
  while(i < 10){
   System.out.println(i);
   i = i + 1;
  //i++
  }
  for(int j = 0;j < 10;j = j + 1){
  System.out.println("Olá");
  //j++
  }
  int k = 0;
  while(k < 10){
   System.out.println("Tudo bem?");
   k = k + 1;
  //k++
  }
 
}
}
