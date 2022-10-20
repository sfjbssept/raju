import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/Services/admin.service';
import FlightDetails from 'src/app/entity/FlightDetails';

@Component({
  selector: 'app-addflight',
  templateUrl: './addflight.component.html',
  styleUrls: ['./addflight.component.css']
})
export class AddflightComponent implements OnInit {

  flightDetails:FlightDetails=new FlightDetails();

  save() {
    const observables = this.adminService.addFlight(this.flightDetails);
    console.log(this.flightDetails);
    observables.subscribe(
      (response: any) => {
        console.log(response);
      },
      function (error) {
        console.log(error);
        alert('Something went wrong try again!');
      }
    );
  }
  constructor(public adminService: AdminService) { }

  ngOnInit(): void {
  }

}
