import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { AssessoriaPageRoutingModule } from './assessoria-routing.module';

import { AssessoriaPage } from './assessoria.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    AssessoriaPageRoutingModule
  ],
  declarations: [AssessoriaPage]
})
export class AssessoriaPageModule {}
