import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  valor='0';
  operacao='';
  memoria='0';

  mostraValor(opcao){
    if(this.valor == '0') {
     this.valor=opcao;
    }else{
      this.valor=this.valor+opcao;
    }


  }

  btPonto(){
    if(this.valor.indexOf('.') == -1){
      if(this.valor == "0"){
        this.mostraValor('0.');
      }else{
        this.mostraValor('.');
      }

    }
  }

  calcular(parametroMetodo){
        if(this.operacao != ""){
          if(this.operacao == "+"){
            this.memoria= (parseFloat(this.memoria)+parseFloat(this.valor)).toString();
          }else if (this.operacao == "-"){
            this.memoria= (parseFloat(this.memoria)-parseFloat(this.valor)).toString();
          }else if (this.operacao == "x"){
            this.memoria= (parseFloat(this.memoria)*parseFloat(this.valor)).toString();
          }else if (this.operacao == "%"){
            this.memoria= (parseFloat(this.memoria)*parseFloat(this.valor)/(100)).toString();
          }else if (this.operacao == "xx"){
            this.memoria= (parseFloat(this.memoria)**parseFloat(this.valor)).toString();
          }else if (this.operacao == "m"){
            this.memoria= (parseFloat(this.memoria)*(221072066)).toString();
          }else if (this.operacao == "x2"){
            this.memoria= (parseFloat(this.memoria)*parseFloat(this.memoria)).toString();
          }else if (this.operacao == "/"){
            if(parseFloat(this.valor) != 0){
             this.memoria= (parseFloat(this.memoria)/parseFloat(this.valor)).toString();
           }
        }
        }else{
          this.memoria = this.valor;
        }
        this.operacao = parametroMetodo;
        if(parametroMetodo == ''){
          this.valor = this.memoria;
          this.memoria = '0';
        }else{
          this.valor = ' ';
        }
  }

  limpar(){
    this.valor = '0';
    this.memoria = '0';
    this.operacao = '';
  }
  constructor() {}
}
