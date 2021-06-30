import { Component, OnInit } from '@angular/core';
import { Menu } from '../../menu';
import { TestService } from '../test.service';

@Component({
  selector: 'app-menu-form',
  templateUrl: './menu-form.component.html',
  styleUrls: ['./menu-form.component.css']
})
export class MenuFormComponent implements OnInit {

  menu : Menu = new Menu();
  constructor(private service : TestService) { }

  ngOnInit(): void {
  }
  addNewMenu(): void{
    this.service.addNewMenu(this.menu).subscribe(()=> {alert("New Menu Added Successfully")});
  }

}
