import { HttpClient } from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(private httpClient:HttpClient) {}

  register(body) {
    return this.httpClient.post("http://localhost:8080/register", body);
  }

  login(body) {
    return this.httpClient.post("http://localhost:8080/login", body);
  }
}
