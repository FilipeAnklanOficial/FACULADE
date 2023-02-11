import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ConstrucaoPageRoutingModule } from './construcao-routing.module';

import { ConstrucaoPage } from './construcao.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ConstrucaoPageRoutingModule
  ],
  declarations: [ConstrucaoPage]
})
export class ConstrucaoPageModule {}
