class jogoParImpar{
 public static void main(String[] args){
   int x = 13;
   while(x != 1){
    //Par
    if(x % 2 == 0){x /= 2;}
    //Impar
    else{ x = 3 * x + 1; }
    System.out.println(x);
}
    
}
}
