import { Component, OnInit } from '@angular/core';
import { Cart } from 'src/cart';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-display',
  templateUrl: './menu-display.component.html',
  styleUrls: ['./menu-display.component.css']
})
export class MenuDisplayComponent implements OnInit {

  constructor(private service : TestService) { }
  
  menus : any = this.service.getMenuData().subscribe((data: any)=> this.menus=data);
  thecart !: any;
  ngOnInit(): void {
  }

  addtoCart(name : string, price : number) : void {
    thecart : new Cart(name, price);
    this.service.addtoCart(this.thecart);
  }
}


