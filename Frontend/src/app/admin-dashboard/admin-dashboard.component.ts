import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  constructor(private service : TestService) { }

  restaurant : any = this.service.FeatchAllRestauarnts().subscribe((data: any)=> this.restaurant=data);
  menus : any = this.service.getMenuData().subscribe((data: any)=> this.menus=data);
  ngOnInit(): void {
  }

}
