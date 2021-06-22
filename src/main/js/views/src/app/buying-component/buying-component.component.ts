import { Component, OnInit } from '@angular/core';
import {Sneakers} from "../classes/Sneakers";
import {SneakersService} from "../classes/SneakersService";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-buying-component',
  templateUrl: './buying-component.component.html',
  styleUrls: ['./buying-component.component.css']
})
export class BuyingComponentComponent implements OnInit {

  sneakers: Sneakers[];
  constructor(public dialog: MatDialog, private sneakersService: SneakersService) { }

  ngOnInit(): void {
    this.sneakersService.getSneakers().then(value => {
      this.sneakers = value;
    })
  }

  firstSneakers() {
    return this.sneakers[0];
  }
}
