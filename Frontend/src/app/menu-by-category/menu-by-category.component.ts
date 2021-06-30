import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/cart';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-by-category',
  templateUrl: './menu-by-category.component.html',
  styleUrls: ['./menu-by-category.component.css']
})
export class MenuByCategoryComponent implements OnInit {

  constructor(private service : TestService) { }
  menus : any = this.service.getNonVegItems().subscribe((data: any)=> this.menus=data);

  thecart !: any;
  ngOnInit(): void {
  }

  addtoCart(name : string, price : number) : void {
    thecart : new Cart(name, price);
    this.service.addtoCart(this.thecart);
  }
}
