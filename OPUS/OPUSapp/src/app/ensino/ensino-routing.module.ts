import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EnsinoPage } from './ensino.page';

const routes: Routes = [
  {
    path: '',
    component: EnsinoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class EnsinoPageRoutingModule {}
