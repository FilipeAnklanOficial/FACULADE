import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-paglogin',
  templateUrl: './paglogin.page.html',
  styleUrls: ['./paglogin.page.scss'],
})
export class PagloginPage implements OnInit {

  constructor(private navCTRL: NavController) {}
  ShowPagehome1(){
  this.navCTRL.navigateForward('home1');
  }
  ngOnInit() {
  }

}
