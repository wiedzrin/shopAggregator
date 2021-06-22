import { Component, OnInit } from '@angular/core';
import {Sneakers} from "../classes/Sneakers";
import {MatDialog} from "@angular/material/dialog";
import {SneakersService} from "../classes/SneakersService";
import {BankCardComponent} from "../bank-card/bank-card.component";

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  sneakers: Sneakers[];
  constructor(public dialog: MatDialog, private sneakersService: SneakersService) { }

  ngOnInit(): void {
    this.sneakersService.getSneakers().then(value => {
      this.sneakers = value;
    })
  }

  payment() {
    this.dialog.open(BankCardComponent);
  }

}
