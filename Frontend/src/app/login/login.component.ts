import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username !: string;
  password !: string;
  constructor(public router: Router) { }

  ngOnInit(): void {
  }
  adminLogin(){
    if(this.username=="admin" && this.password=="Admin"){
      console.log("Admin Login");
      this.router.navigate(['adminDashboard']);
    }
    else{ 
      console.log(this.username + ' ' + this.password);
      this.router.navigate(['adminDashboard']);
    }
  }

}
