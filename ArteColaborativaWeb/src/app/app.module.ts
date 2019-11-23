import { ArtesaoService } from './artesao/artesao.service';
import { LojistaService } from './lojista/lojista.service';
import { environment } from './../environments/environment';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { EstoqueComponent } from './estoque/estoque.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { HomeComponent } from './home/home.component';

import { HttpClientModule } from '@angular/common/http';

//Adicionando imports para o firebase e configuração de token
import { AngularFireModule } from '@angular/fire';
import { AngularFireDatabaseModule } from '@angular/fire/database';
import { LojistaComponent } from './lojista/lojista.component';
import { ArtesaoComponent } from './artesao/artesao.component';
import { EstoqueService } from './estoque/estoque.service';

@NgModule({
  declarations: [
    AppComponent,
    UsuariosComponent,
    EstoqueComponent,
    PagenotfoundComponent,
    HomeComponent,
    LojistaComponent,
    ArtesaoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [LojistaService, ArtesaoService, EstoqueService],
  bootstrap: [AppComponent]
})
export class AppModule { }
