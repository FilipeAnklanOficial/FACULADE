import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PagcadastroPage } from './pagcadastro.page';

const routes: Routes = [
  {
    path: '',
    component: PagcadastroPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PagcadastroPageRoutingModule {}
