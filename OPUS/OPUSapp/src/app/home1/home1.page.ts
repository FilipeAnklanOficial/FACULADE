import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';


@Component({
  selector: 'app-home1',
  templateUrl: './home1.page.html',
  styleUrls: ['./home1.page.scss'],
})
export class Home1Page implements OnInit {

constructor(private navCTRL: NavController) {}

ShowPagePerfil(){
  this.navCTRL.navigateForward('perfil');
}
ShowPageConstrucao(){
  this.navCTRL.navigateForward('construcao');
}
ShowPageSaude(){
  this.navCTRL.navigateForward('saude');
}
ShowPageEstetica(){
  this.navCTRL.navigateForward('estetica');
}
ShowPageEntretenimento(){
  this.navCTRL.navigateForward('entretenimento');
}
ShowPageFretes(){
  this.navCTRL.navigateForward('fretes');
}
ShowPageAssessoria(){
  this.navCTRL.navigateForward('assessoria');
}
ShowPageEnsino(){
  this.navCTRL.navigateForward('ensino');
}
ShowPageAnimal(){
  this.navCTRL.navigateForward('animal');
}

  ngOnInit() {
  }

}



