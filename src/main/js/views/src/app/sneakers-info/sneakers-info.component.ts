import { Component, OnInit } from '@angular/core';
import {Sneakers} from "../classes/Sneakers";
import {SneakersService} from "../classes/SneakersService";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-sneakers-info',
  templateUrl: './sneakers-info.component.html',
  styleUrls: ['./sneakers-info.component.css']
})
export class SneakersInfoComponent implements OnInit {

  sneakers: Sneakers[];
  constructor(public dialog: MatDialog, private sneakersService: SneakersService) { }

  ngOnInit(): void {
    this.sneakersService.getSneakers().then(value => {
      this.sneakers = value;
    })
  }
}
