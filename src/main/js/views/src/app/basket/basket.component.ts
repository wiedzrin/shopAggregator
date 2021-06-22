import { Component, OnInit } from '@angular/core';
import {Sneakers} from "../classes/Sneakers";
import {SneakersService} from "../classes/SneakersService";
import {MatDialog} from "@angular/material/dialog";
import {PaymentComponent} from "../payment/payment.component";

@Component({
  selector: 'app-basket',
  templateUrl: './basket.component.html',
  styleUrls: ['./basket.component.css']
})
export class BasketComponent implements OnInit {

  sneakers: Sneakers[];
  constructor(public dialog: MatDialog, private sneakersService: SneakersService) { }

  ngOnInit(): void {
    this.sneakersService.getSneakers().then(value => {
      this.sneakers = value;
    })
  }

  payment() {
    this.dialog.open(PaymentComponent);
  }
}
