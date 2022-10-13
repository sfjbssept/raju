import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/Services/admin.service';
import FlightDetails from 'src/app/entity/FlightDetails'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  flightDetails:FlightDetails[]=[];

  constructor(public adminService:AdminService ) { }

  ngOnInit(): void {

    const promise=this.adminService.getAllFlght();
    promise.subscribe((responce)=>{
    console.log(responce);
    //this.students = responce as Student[];
    });
  }

}
