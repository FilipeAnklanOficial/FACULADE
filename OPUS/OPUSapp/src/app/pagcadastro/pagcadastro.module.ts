import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PagcadastroPageRoutingModule } from './pagcadastro-routing.module';

import { PagcadastroPage } from './pagcadastro.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PagcadastroPageRoutingModule
  ],
  declarations: [PagcadastroPage]
})
export class PagcadastroPageModule {}
