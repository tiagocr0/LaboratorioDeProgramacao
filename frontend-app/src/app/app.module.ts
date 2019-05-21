import { NgModule } from '@angular/core';

import{ HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { CoreModule } from './core/core.module';

@NgModule({
  declarations: [AppComponent],
  imports: [CoreModule, AppRoutingModule, HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule {}
