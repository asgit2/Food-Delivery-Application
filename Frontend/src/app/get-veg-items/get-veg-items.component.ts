import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/cart';
import { TestService } from '../test.service';

@Component({
  selector: 'app-get-veg-items',
  templateUrl: './get-veg-items.component.html',
  styleUrls: ['./get-veg-items.component.css']
})
export class GetVegItemsComponent implements OnInit {

  constructor(private service : TestService) { }
  menus : any = this.service.getVegItems().subscribe((data: any)=> this.menus=data);

  thecart !: any;
  ngOnInit(): void {
  }

  addtoCart(name : string, price : number) : void {
    thecart : new Cart(name, price);
    this.service.addtoCart(this.thecart);
  }

}
