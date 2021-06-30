import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/customer';
import { TestService } from '../test.service';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  theCustomer : any = new Customer();
  constructor(private service : TestService) { }
  ngOnInit(): void {
  }

  addCustomerDetails(){
    return this.service.addNewCustomer(this.theCustomer).subscribe(() => {alert("Successfully Registered | Now Login and enjoy your food")});
  }
}
