import { Component } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(private navCTRL: NavController) {}
  ShowPagePaglogin(){
  this.navCTRL.navigateForward('paglogin');
  }
  ShowPagePagCadastro(){
  this.navCTRL.navigateForward('pagcadastro');
}
}


