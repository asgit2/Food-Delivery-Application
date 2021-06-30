import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  constructor(){}
    //constructor(private service : TestService) { }
  //credential : any = new Credential();
  ngOnInit(): void {
  }

  // addCredentialsUser(){
  //   return this.service.addCredential(this.credential).subscribe(() => {alert("Kindly fill the other details")});
  // }
  // addCredentialsRest(){
  //   return this.service.addCredential(this.credential).subscribe(() => {alert("Kindly fill the other details")});
  // }
}
