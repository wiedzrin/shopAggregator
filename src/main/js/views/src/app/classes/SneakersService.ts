import { HttpClient } from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Sneakers} from "./Sneakers";

@Injectable({
  providedIn: 'root',
})
export class SneakersService {
  constructor(private httpClient:HttpClient) {}

  getSneakers():Promise<Sneakers[]> {
    return this.httpClient.get<Sneakers[]>("http://localhost:8080/getSneakers").toPromise();
  }
}
