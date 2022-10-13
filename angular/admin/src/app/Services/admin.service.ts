import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
const BASE_URL="http://localhost:7071/api/getAllflight"

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  getAllFlght(){
    return this.http.get(BASE_URL)
  }

  constructor(public http:HttpClient) { }
}
