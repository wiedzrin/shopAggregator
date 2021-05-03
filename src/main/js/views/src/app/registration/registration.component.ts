import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { NgForm } from "@angular/forms";
import { AuthService } from "../classes/AuthService";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  registry(registrationForm: NgForm) {
    let body = {
      name: registrationForm.value.name,
      surname: registrationForm.value.surname,
      username: registrationForm.value.username,
      password: registrationForm.value.password,
      eMail: registrationForm.value.eMail
    }
    this.authService.register(body).subscribe();
  }
}
