import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  
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
}
