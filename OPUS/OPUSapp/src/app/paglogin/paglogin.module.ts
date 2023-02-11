import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PagloginPageRoutingModule } from './paglogin-routing.module';

import { PagloginPage } from './paglogin.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PagloginPageRoutingModule
  ],
  declarations: [PagloginPage]
})
export class PagloginPageModule {}
