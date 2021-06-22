import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {Routes, RouterModule} from "@angular/router";

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {MatMenuModule} from "@angular/material/menu";
import {MatButtonModule} from "@angular/material/button";
import {MatDialogModule} from "@angular/material/dialog";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatCardModule} from '@angular/material/card';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from "@angular/forms";
import {MatIconModule} from '@angular/material/icon';
import {MatSelectModule} from '@angular/material/select';
import {NgImageSliderModule} from 'ng-image-slider';
import {Ng2CarouselamosModule} from 'ng2-carouselamos';

import {RegistrationComponent} from './registration/registration.component';
import {LoginComponent} from './login/login.component';
import {PersonalAccountComponent} from './personal-account/personal-account.component';
import {MyOrdersComponent} from "./my-orders/my-orders.component";
import {SneakersSectionComponent} from './sneakers-section/sneakers-section.component';
import {MatOptionModule} from "@angular/material/core";
import { BuyingComponentComponent } from './buying-component/buying-component.component';
import { SneakersInfoComponent } from './sneakers-info/sneakers-info.component';

const appRoutes: Routes = [
  {path: 'personal-account', component: PersonalAccountComponent},
  {path: 'orders', component: MyOrdersComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    PersonalAccountComponent,
    MyOrdersComponent,
    SneakersSectionComponent,
    BuyingComponentComponent,
    SneakersInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatCardModule,
    FormsModule,
    MatIconModule,
    HttpClientModule,
    NgImageSliderModule,
    Ng2CarouselamosModule,
    MatOptionModule,
    MatSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
