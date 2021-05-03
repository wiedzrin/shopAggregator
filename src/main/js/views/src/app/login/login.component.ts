import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {NgForm} from "@angular/forms";
import {AuthService} from "../classes/AuthService";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  login(loginForm: NgForm) {
    let body = {
      username: loginForm.value.username,
      password: loginForm.value.password
    }
    this.authService.login(body).subscribe();
  }
}
