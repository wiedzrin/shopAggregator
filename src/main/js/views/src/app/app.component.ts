import { Component } from '@angular/core';
import { MatDialog } from "@angular/material/dialog";

import {LoginComponent} from "./login/login.component";
import {RegistrationComponent} from "./registration/registration.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  displayPersonalAccount = false;
  displayOrders = false;
  slideIndex:number = 1;

  constructor(public dialog: MatDialog) {}

  login() {
    this.dialog.open(LoginComponent);
  }

  registry() {
    this.dialog.open(RegistrationComponent);
  }

  openPersonalAccount() {
    if (this.displayOrders == true) {
      this.displayOrders = !this.displayOrders;
    }
    this.displayPersonalAccount = !this.displayPersonalAccount;
  }

  openOrders() {
    if (this.displayPersonalAccount == true) {
      this.displayPersonalAccount = !this.displayPersonalAccount;
    }
    this.displayOrders = !this.displayOrders;
  }
}
