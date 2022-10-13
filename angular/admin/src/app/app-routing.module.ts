import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AddflightComponent } from './components/addflight/addflight.component'
import { UpdateflightComponent } from './components/updateflight/updateflight.component';
import { DeleteflightComponent } from './components/deleteflight/deleteflight.component';

const routes: Routes = [{path:"",component:HomeComponent},{path:"addFlight",component:AddflightComponent},
{path:"updateFlight",component:UpdateflightComponent},{path:"deleteFlight",component:DeleteflightComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
