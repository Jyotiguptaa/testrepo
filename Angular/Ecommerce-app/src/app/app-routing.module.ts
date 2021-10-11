import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginModuleComponent } from './login-module/login-module.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [{path:'login',component:LoginModuleComponent},
{path:'registration',component:RegistrationComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
