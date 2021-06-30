import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/cart';
import { TestService } from '../test.service';

@Component({
  selector: 'app-get-menu-by-restaurant',
  templateUrl: './get-menu-by-restaurant.component.html',
  styleUrls: ['./get-menu-by-restaurant.component.css']
})
export class GetMenuByRestaurantComponent implements OnInit {

  constructor(private service : TestService) { }

  menus : any = this.service.getMenuByRestaurant().subscribe((data: any)=> this.menus=data);
  thecart !: any;
  ngOnInit(): void {
  }

  addtoCart(name : string, price : number) : void {
    thecart : new Cart(name, price);
    this.service.addtoCart(this.thecart);
  }
}
