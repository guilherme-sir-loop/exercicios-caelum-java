class AvaliacaoVP {
   int periodo;
   double valorFuturo;
   double valorPresente;
   double taxaDeJuros;
   double contaValorPresente(double valorPresenteNovo) {
    valorPresenteNovo = (this.valorFuturo / (1 + this.taxaDeJuros) ^ this.periodo); 
    this.valorPresente = valorPresenteNovo;
} 


}
