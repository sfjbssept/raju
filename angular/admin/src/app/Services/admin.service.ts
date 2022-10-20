import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
const BASE_URL="http://localhost:7071/api"

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  getAllFlght(){
    return this.http.get(BASE_URL+"/getAllflight")
  }

  addFlight(flightDetails:{flightNumber:number,airlineName:string,flyFrom:string,flyto:string,satrtDateTime:string,
    endDateTime:string,instrumentUsed:string,totalNoBSeat:number,toTalNoESeat:number,ticketCost:number,numberOfrow:number,scheduledDay:string}){
    return this.http.post(BASE_URL+"/flightdetail",flightDetails);
  }
  constructor(public http:HttpClient) { }
}
