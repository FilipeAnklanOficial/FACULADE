import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ConstrucaoPage } from './construcao.page';

const routes: Routes = [
  {
    path: '',
    component: ConstrucaoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ConstrucaoPageRoutingModule {}
