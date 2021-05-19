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

  items: Array<any> = [];

  constructor(public dialog: MatDialog) {
    this.items = [
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' },
      { name: '../assets/images/popularityPhoto.jpg' }
    ];
  }

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
