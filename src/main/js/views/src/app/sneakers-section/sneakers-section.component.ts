import { Component, OnInit } from '@angular/core';
import {Sneakers} from "../classes/Sneakers";
import {SneakersService} from "../classes/SneakersService";
import {MatDialog} from "@angular/material/dialog";
import {BuyingComponentComponent} from "../buying-component/buying-component.component";
import {SneakersInfoComponent} from "../sneakers-info/sneakers-info.component";

@Component({
  selector: 'app-sneakers-section',
  templateUrl: './sneakers-section.component.html',
  styleUrls: ['./sneakers-section.component.css']
})
export class SneakersSectionComponent implements OnInit{
  sneakers: Sneakers[];
  constructor(public dialog: MatDialog, private sneakersService: SneakersService) { }

  ngOnInit(): void {
    this.sneakersService.getSneakers().then(value => {
      this.sneakers = value;
    })
  }

  showInfo() {
    this.dialog.open(SneakersInfoComponent);
  }

  buy() {
    this.dialog.open(BuyingComponentComponent);
  }
}
