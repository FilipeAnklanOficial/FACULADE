import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { EnsinoPageRoutingModule } from './ensino-routing.module';

import { EnsinoPage } from './ensino.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    EnsinoPageRoutingModule
  ],
  declarations: [EnsinoPage]
})
export class EnsinoPageModule {}
