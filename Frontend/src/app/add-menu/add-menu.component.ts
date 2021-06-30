import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';
import { Menu } from '../../menu';

@Component({
  selector: 'app-add-menu',
  templateUrl: './add-menu.component.html',
  styleUrls: ['./add-menu.component.css']
})
export class AddMenuComponent implements OnInit {

  menu : Menu = new Menu();
  constructor(private service : TestService) { }

  ngOnInit(): void {
  }
  getMenuData():any{
    return this.service.getMenuData();
  }

  addNewMenu(): void{
    this.service.addNewMenu(this.menu).subscribe(()=> {alert("New Menu Added Successfully")});
  }

  menuId  !: number;
  deleteMenu(): void{
    this.service.deleteMenu(this.menuId);
  }

}
