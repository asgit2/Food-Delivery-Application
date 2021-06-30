import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-paymentgateway',
  templateUrl: './paymentgateway.component.html',
  styleUrls: ['./paymentgateway.component.css']
})
export class PaymentgatewayComponent implements OnInit {

  constructor(private service : TestService) { }
  cart : any = this.service.getAllCart().subscribe((data: any)=> this.cart=data);
  ngOnInit(): void {
  }

  getTotal(index : number): any {
    let sum = 0;
    for (let i = 0; i < this.cart.length; i++) {
      sum += this.cart[i].price;
    }
    return sum;
  }

  displayMessage(){
    alert(`
    Payment Succesful 
    untill your food is getting ready 
    please give us your feedback`);
  }
}
