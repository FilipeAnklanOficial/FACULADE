import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-pagcadastro',
  templateUrl: './pagcadastro.page.html',
  styleUrls: ['./pagcadastro.page.scss'],
})
export class PagcadastroPage implements OnInit {

  constructor(private navCTRL: NavController) {}
  ShowPagePaglogin(){
  this.navCTRL.navigateForward('paglogin');
  }

  ngOnInit() {
  }

}
