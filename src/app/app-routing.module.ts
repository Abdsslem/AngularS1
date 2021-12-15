import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfsComponent } from './profs/profs.component';
import { AddProfComponent } from './add-prof/add-prof.component';
import { UpdateProfComponent } from './services/update-prof/update-prof.component';


const routes: Routes = [
  {path: "profs", component : ProfsComponent},
  {path: "add-prof", component : AddProfComponent},
  { path: "", redirectTo: "profs", pathMatch: "full" },
  {path: "updateProf/:id", component: UpdateProfComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
