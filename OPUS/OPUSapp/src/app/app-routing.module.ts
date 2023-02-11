import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'paglogin',
    loadChildren: () => import('./paglogin/paglogin.module').then( m => m.PagloginPageModule)
  },
  {
    path: 'pagcadastro',
    loadChildren: () => import('./pagcadastro/pagcadastro.module').then( m => m.PagcadastroPageModule)
  },
  {
    path: 'home1',
    loadChildren: () => import('./home1/home1.module').then( m => m.Home1PageModule)
  },
  {
    path: 'perfil',
    loadChildren: () => import('./perfil/perfil.module').then( m => m.PerfilPageModule)
  },
  {
    path: 'construcao',
    loadChildren: () => import('./construcao/construcao.module').then( m => m.ConstrucaoPageModule)
  },
  {
    path: 'saude',
    loadChildren: () => import('./saude/saude.module').then( m => m.SaudePageModule)
  },
  {
    path: 'estetica',
    loadChildren: () => import('./estetica/estetica.module').then( m => m.EsteticaPageModule)
  },
  {
    path: 'entretenimento',
    loadChildren: () => import('./entretenimento/entretenimento.module').then( m => m.EntretenimentoPageModule)
  },
  {
    path: 'fretes',
    loadChildren: () => import('./fretes/fretes.module').then( m => m.FretesPageModule)
  },
  {
    path: 'ensino',
    loadChildren: () => import('./ensino/ensino.module').then( m => m.EnsinoPageModule)
  },
  {
    path: 'animal',
    loadChildren: () => import('./animal/animal.module').then( m => m.AnimalPageModule)
  },
  {
    path: 'assessoria',
    loadChildren: () => import('./assessoria/assessoria.module').then( m => m.AssessoriaPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
