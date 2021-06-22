import { Component } from '@angular/core';
import { MatDialog } from "@angular/material/dialog";

import {LoginComponent} from "./login/login.component";
import {RegistrationComponent} from "./registration/registration.component";
import {HttpClient} from "@angular/common/http";
import {BuyingComponentComponent} from "./buying-component/buying-component.component";
import {PersonalAccountComponent} from "./personal-account/personal-account.component";
import {MyOrdersComponent} from "./my-orders/my-orders.component";
import {BasketComponent} from "./basket/basket.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  displayPersonalAccount = false;
  displayOrders = false;

  constructor(public dialog: MatDialog, private http: HttpClient) {
  }

  login() {
    this.dialog.open(LoginComponent);
  }

  registry() {
    this.dialog.open(RegistrationComponent);
  }



  openPersonalAccount() {
    this.dialog.open(PersonalAccountComponent);
  }

  openOrders() {
    this.dialog.open(MyOrdersComponent);
  }


  parseAndSave() {
    this.http.post("http://localhost:8080/parseAndSaveSneakers", null).subscribe();
  }

  openBasket() {
    this.dialog.open(BasketComponent);
  }
}
