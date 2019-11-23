import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { HomeComponent } from './home/home.component';
import { EstoqueComponent } from './estoque/estoque.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'usuarios', component: UsuariosComponent},
  {path: 'estoque', component: EstoqueComponent},
  {path: '**', component: PagenotfoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
