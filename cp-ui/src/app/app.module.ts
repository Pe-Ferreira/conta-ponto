import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AmigoListComponent } from './amigo/amigo-list.component';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AmigoListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
