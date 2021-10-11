import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

flag=false;
name="";

show()
{
  this.flag=true;
  this.name="Jyoti";
  console.log("name"+this.name);
}



}
