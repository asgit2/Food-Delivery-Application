import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/cart';
import { TestService } from '../test.service';

@Component({
  selector: 'app-get-drinks',
  templateUrl: './get-drinks.component.html',
  styleUrls: ['./get-drinks.component.css']
})
export class GetDrinksComponent implements OnInit {

  constructor(private service : TestService) { }
  menus : any = this.service.getDrinksItems().subscribe((data: any)=> this.menus=data);

  thecart !: any;
  ngOnInit(): void {
  }

  addtoCart(name : string, price : number) : void {
    thecart : new Cart(name, price);
    this.service.addtoCart(this.thecart);
  }

}
